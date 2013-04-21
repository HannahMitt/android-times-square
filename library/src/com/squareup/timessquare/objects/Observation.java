package com.squareup.timessquare.objects;

import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class Observation implements Parcelable, Comparable<Observation>{

	public Observation(Parcel in) {
		readFromParcel(in);
	}

	public Date finish_time;
	public Date start_time;

	public Target target;
	public Satellite satellite;
	public Link link;
	public int revolution;

	public boolean fallsOnDate(Date date){
		if(date.getYear() >= start_time.getYear() && date.getYear() <= finish_time.getYear()){
			if(date.getMonth() >= start_time.getMonth() && date.getMonth() <= finish_time.getMonth()){
				if(date.getDate() >= start_time.getDate() && date.getDate() <= finish_time.getDate()){
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return satellite.name + "\n" + target.name + "\n" + super.toString();
	}

	@Override
	public int describeContents() {
		return 0;
	}

	private void readFromParcel(Parcel in) {
		start_time = (Date) in.readSerializable();
		finish_time = (Date) in.readSerializable();
		target = (Target) in.readSerializable();
		satellite = (Satellite) in.readSerializable();
		link = (Link) in.readSerializable();
		revolution = in.readInt();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeSerializable(start_time);
		dest.writeSerializable(finish_time);
		dest.writeSerializable(target);
		dest.writeSerializable(satellite);
		dest.writeSerializable(link);
		dest.writeInt(revolution);
	}

	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
		public Observation createFromParcel(Parcel in) {
			return new Observation(in);
		}

		@Override
		public Observation[] newArray(int size) {
			return new Observation[size];
		}
	};

	@Override
	public int compareTo(Observation another) {
		return start_time.compareTo(another.start_time);
	}

}
