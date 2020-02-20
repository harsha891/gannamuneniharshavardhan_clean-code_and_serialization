package com.example.cleancode;

public class HouseConstructionCost {

	private double area;
	private String materialStandard[]= {"","Standard","Above Standard","High Standard","High Standard and Fully Automated"};
	private int requirements;
	private double cost;

	public HouseConstructionCost(double area, int material, int automation) {
		// TODO Auto-generated constructor stub
		this.area=area;
		
		if(material==1) {
			this.requirements=material;
			cost=1200;
		}
		else if(material==2) {
			this.requirements=material;
			cost=1500;
		}
		else if(material==3) {
			if(automation==1)
			{
				this.requirements=material;
				cost=2500;
			}
			else
			{
				this.requirements=material;
				cost=1800;
			}
		}
	}

	public void Calculate() {
		// TODO Auto-generated method stub
		double totalCost=area*cost;
		System.out.print("Total estimated cost of "+area+" sq.ft house with "+materialStandard[requirements]+" materials is "+totalCost);
		
		
	}
	
	
}
