package com.Game_v4;

public class Vector {
	float x,y;
	public Vector(float x,float y) {
		this.x = x;
		this.y =y;
	}
	public void add(Vector e) {
		this.x+=e.x;
		this.y+=e.y;
	}
}
