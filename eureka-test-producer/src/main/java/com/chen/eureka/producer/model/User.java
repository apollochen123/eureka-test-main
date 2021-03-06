package com.chen.eureka.producer.model;

import com.chen.eureka.producer.aspect.ParamAnnotation;

@ParamAnnotation
public class User {
	private String id;
	private String name;
	private String address;
	public User(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public User() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString(){
		return "id:"+id+"  name:"+name+"   address"+address;
	}
}
