package com.example.cleancode;

public class CompoundInterest {

	private double timePeriod;
	private double time;
	private double rate;
	private double principle;

	public CompoundInterest(double principle, double rate, double time, double timePeriod) {
		// TODO Auto-generated constructor stub
		this.principle=principle;
		this.rate=rate;
		this.time=time;
		this.timePeriod=timePeriod;
	}

	public void Calculate() {
		// TODO Auto-generated method stub
		double compoundInterest=principle*(Math.pow(1 - (rate/timePeriod),timePeriod*time));
		System.out.println("Compound Interest : "+compoundInterest);
		
	}
	

}
