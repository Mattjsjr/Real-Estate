package Pt1;

import java.util.HashMap;
import java.util.Set;

public class Condo extends Residential{

private int floorLvl;
	
	Condo(){
		super();
		floorLvl = 0;
	}
	
	Condo(String streetAddress, int zip, int bedCount, double bathCount, double sqFootage, int floorLvl){
		super(streetAddress, zip, bedCount, bathCount, sqFootage);
		this.setFloorLvl(floorLvl);
	}

	public int getfloorLvl() {
		return floorLvl;
	}
	
	public void setFloorLvl(int floorLvl) {
		this.floorLvl = floorLvl;
	}

	@Override
	public double calculateAppraisalPrice() {
		double appraisalPrice = this.getSqFootage()*88+this.getBedCount()*8000+
				this.getBathCount()*10000+this.getfloorLvl()*5000;
		return appraisalPrice;
	}
	
	@Override
	public String toString() {
		String finalOutput = "";
	
	
		finalOutput += "-------------------------------------------------------------------------------------------------------";
		finalOutput += String.format("%nResidence Type: Condo           Address: %s           Zip Code: %d", this.getStreetAddress(), this.getZip());
		finalOutput += "\n-------------------------------------------------------------------------------------------------------";
		finalOutput += String.format("%nSq Footage: %.2f", this.getSqFootage());
		finalOutput += String.format("%nBedrooms: %d", this.getBedCount());
		finalOutput += String.format("%nBathrooms: %.1f", this.getBathCount());
		finalOutput += String.format("%nFloor Level: %d", this.getfloorLvl());
		finalOutput += "\n------------------------------------------";
		finalOutput += String.format("%nAppraisal Price: $%.2f", this.calculateAppraisalPrice());
		finalOutput += String.format("%nList Price: $%.2f", this.getListPrice());
		
		return finalOutput;
	}

	




	
	
}
