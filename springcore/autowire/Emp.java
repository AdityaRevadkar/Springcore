package com.springcore.autowire;

public class Emp {
	
	private Address addres;

	public Address getAddress() {
		return addres;
	}

	public void setAddress(Address addres) {
		 this.addres=addres;
	}

	@Override
	public String toString() {
		return "Emp [address=" + addres + "]";
	}

	public Emp() {
		super();
		
	}

	public Emp(Address addres) {
		super();
		this.addres = addres;
	}


	

}
