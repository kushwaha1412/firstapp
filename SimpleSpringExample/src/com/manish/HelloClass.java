package com.manish;

public class HelloClass {
	private String printName;

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}
	
	public void displayName(){
		System.out.println("Hello :  "+printName);
	}

}
