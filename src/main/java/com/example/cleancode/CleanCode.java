package com.example.cleancode;

import java.util.Scanner;

public class CleanCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("\t1.Calculate Simple Interest.\n\t"
				+ "2.Calculate Compound Interest.\n\t"
				+ "3.House construction cost.");
		System.out.print("What do you want to do:");
		int option=in.nextInt();
		if(option==1)
		{
			System.out.println("\tCAlCULATING SIMPLE INTEREST:");
			
			System.out.print("Enter principle:");	
			double principle=in.nextDouble();
			
			System.out.print("Enter rate:");	
			double rate=in.nextDouble();
			
			System.out.print("Enter time:");	
			double time=in.nextDouble();
			
			SimpleInterest simple_interest=new SimpleInterest(principle,rate,time);
			simple_interest.Calculate();
		}
		else if(option==2)
		{
			System.out.println("\tCAlCULATING COMPOUND INTEREST:");
			
			System.out.print("Enter principle:");
			double principle=in.nextDouble();
			
			System.out.print("Enter rate:");
			double rate=in.nextDouble();
			
			System.out.print("Enter time:");	
			double time=in.nextDouble();
			
			System.out.print("Enter time period:");	
			double timePeriod=in.nextDouble();
			
			CompoundInterest compound_interest=new CompoundInterest(principle,rate,time,timePeriod);
			compound_interest.Calculate();
		}
		else
		{
			System.out.println("\tCALCULATING HOUSE CONSTRUCTION COST:");
			
			System.out.print("Enter area in sq.ft :");	
			double area=in.nextDouble();
			
			System.out.print("\tMATERIAL STANDARDS:\n\t\t"
					+ "1.Standard\n\t\t"
					+ "2.Above Standard\n\t\t"
					+ "3.High Standard\n"
					+ "Enter material standards :");	
			int material=in.nextInt();
			int automation=2;
			if(material==3) {
			System.out.print("\tHOME AUTOMATION:\n\t\t"
					+ "1.FULLY AUTOMATED\t\t"
					+ "2.NOT AUTOMATED\n"
					+ "Enter Home automation details :");
			
			automation=in.nextInt();
			}
			HouseConstructionCost house_construction_cost=new HouseConstructionCost(area,material,automation);
			house_construction_cost.Calculate();
		}
	}

}

