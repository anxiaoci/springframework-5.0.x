package com.juan.entity;

/**
 * @author admin
 * @date 2020/4/5
 * @decription:
 */

public class Color {
	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color() {
	}

	protected Color(String name) {
		this.name = name;
		System.out.println(name);
	}


}
