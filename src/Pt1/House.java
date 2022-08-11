package Pt1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class House extends Residential {

	
	
	private double yardAcres;
	
	House(){
		super();
		yardAcres = 0;
		
	}
	
	House(String streetAddress, int zip, int bedCount, double bathCount, double sqFootage, double yardAcres){
		super(streetAddress, zip, bedCount, bathCount, sqFootage);
		this.setYardAcres(yardAcres);
	}

	public double getYardAcres() {
		return yardAcres;
	}
	
	public void setYardAcres(double yardAcres) {
		this.yardAcres = yardAcres;
	}

	@Override
	public double calculateAppraisalPrice() {
		double appraisalPrice =	this.getSqFootage() * 97 + this.getBedCount()*10000+
				this.getBathCount()*12000+this.getYardAcres()*46000;
		
		return appraisalPrice;
		
	}
	
	
	@Override
	public String toString() {
		String finalOutput = "";
		
		
		
		
		finalOutput += "-------------------------------------------------------------------------------------------------------";
		finalOutput += String.format("%nResidence Type: House           Address: %s           Zip Code: %d", this.getStreetAddress(), this.getZip());
		finalOutput += "\n-------------------------------------------------------------------------------------------------------";
		finalOutput += String.format("%nSq Footage: %.2f", this.getSqFootage());
		finalOutput += String.format("%nBedrooms: %d", this.getBedCount());
		finalOutput += String.format("%nBathrooms: %.1f", this.getBathCount());
		finalOutput += String.format("%nYard Size (Acres): %.2f", this.getYardAcres());
		finalOutput += "\n------------------------------------------";
		finalOutput += String.format("%nAppraisal Price: $%.2f", this.calculateAppraisalPrice());
		finalOutput += String.format("%nList Price: $%.2f", this.getListPrice());
		
		return finalOutput;
	}



	

	

}
