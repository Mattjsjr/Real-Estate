package Pt1;

public abstract class Property {

	public String streetAddress;
	private int zip;
	private double listPrice;
	private double appraisalPrice;

	Property() {
		streetAddress = "";
		zip = 0;
		appraisalPrice = 0;
		listPrice = 0;
	}

	Property(String streetAddress, int zip) {
		this.streetAddress = streetAddress;
		this.setZip(zip);
		appraisalPrice = 0;
		listPrice = 0;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String SA) {
		streetAddress = SA;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double lp) {
		listPrice = lp;
	}

	public double getApraisalPrice() {
		return appraisalPrice;
	}

	protected void setAppraisalPrice(double appraisalPrice) {
		this.appraisalPrice = appraisalPrice;
	}

	public abstract double calculateAppraisalPrice();



	

}
