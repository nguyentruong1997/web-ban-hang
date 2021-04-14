package com.migi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "role")
public class Role {
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String Name;

	@Column(name = "code")
	private int Code;

	public Role() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

}
