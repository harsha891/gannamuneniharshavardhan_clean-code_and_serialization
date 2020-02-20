package com.example.cleancode;

public class SimpleInterest {

	private double principle;
	private double rate;
	private double time;

	public SimpleInterest(double principle, double rate, double time) {
		// TODO Auto-generated constructor stub
		this.principle=principle;
		this.rate=rate;
		this.time=time;
	}

	public void Calculate() {
		// TODO Auto-generated method stub
		double simpleInterest=(principle*rate*time)/100;
		System.out.println("Simple Interest : "+simpleInterest);
		
	}

	
}
