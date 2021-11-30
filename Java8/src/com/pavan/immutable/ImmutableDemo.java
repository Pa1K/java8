package com.pavan.immutable;

final public class ImmutableDemo{
	
	@Override
	public String toString() {
		return "ImmutableDemo [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	private int id;
	private String name;
	private final Address address;
	
	public ImmutableDemo(int id, String name, Address address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return new Address(address);
	}
	
	

}
