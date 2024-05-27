package com.jollypet.exer;

public class Bands {	
	private String name;
	private int  memberNumber;
	private String address;
	private String label;
	public Bands() {		
		super();
		// TODO Auto-generated constructor stub
	}
	public Bands(String name, int memberNumber, String address, String label) {
		super();
		this.name = name;
		this.memberNumber = memberNumber;
		this.address = address;
		this.label = label;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
