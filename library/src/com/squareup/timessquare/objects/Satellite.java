package com.squareup.timessquare.objects;

import java.io.Serializable;

public class Satellite implements Serializable {

	private static final long serialVersionUID = -6953598619658630380L;

	public String url;
	public boolean active;
	public String name;
	public int id;
	public Link link;

	@Override
	public boolean equals(Object o) {
		if (o instanceof Satellite) {
			return ((Satellite) o).name.equalsIgnoreCase(name);
		} else {
			return super.equals(o);
		}
	}
}
