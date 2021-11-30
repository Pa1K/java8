package com.pavan.clone;



public class CloneDemo {
	
	@Override
	public String toString() {
		return "CloneDemo [id=" + id + ", name=" + name +"]";
	}

	private int id;
	private String name;
	
	
	public CloneDemo(int id, String name) {
	
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		}
	

}
