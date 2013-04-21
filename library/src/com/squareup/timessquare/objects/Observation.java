package com.squareup.timessquare.objects;

import java.util.Date;

import android.os.Parcel;
import android.os.Parcelable;

public class Observation implements Parcelable {

	public Observation(Parcel in) {
		readFromParcel(in);
	}

	public Date finish_time;
	public Date start_time;

	public Target target;
	public Satellite satellite;
	public int revolution;

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
		revolution = in.readInt();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeSerializable(start_time);
		dest.writeSerializable(finish_time);
		dest.writeSerializable(target);
		dest.writeSerializable(satellite);
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
}
