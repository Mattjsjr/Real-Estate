package Pt1;

import java.util.HashMap;
import java.util.Set;

public abstract class Residential extends Property implements Biddable {

	private int bedCount;
	private double bathCount;
	private double sqFootage;
	private static HashMap<String, Double> bids = new HashMap<String, Double>();

	Residential() {
		super();
		bedCount = 0;
		bathCount = 0;
		sqFootage = 0;

	}

	Residential(String streetAddress, int zip, int bedCount, double bathCount, double sqFootage) {
		super(streetAddress, zip);
		this.setBedCount(bedCount);
		this.setBathCount(bathCount);
		this.setSqFootage(sqFootage);
		bids = new HashMap<String, Double>();
	}

	public int getBedCount() {
		return bedCount;
	}

	public double getBathCount() {
		return bathCount;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public void setBathCount(double bathCount) {
		this.bathCount = bathCount;
	}

	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}

	@Override
	public abstract double calculateAppraisalPrice();

	public HashMap<String, Double> getBids() {
		// TODO Auto-generated method stub
		return bids;
	}

	public double getBid(String bid) {

		return 0;
	}

	public Set<String> getBidders() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getBidCount() {
		// TODO Auto-generated method stub
		return bids.size();
	}

	public void newBid(String bid, double rbid) {

		if (bids.containsKey(bid)) {
			bids.remove(bid);
			bids.put(bid, rbid);
		}

		else {
			bids.put(bid, rbid);
		}
		
	

	}

}
