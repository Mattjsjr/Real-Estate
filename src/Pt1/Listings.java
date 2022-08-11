package Pt1;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Listings implements Listable{

	private static HashMap<String, Residential> listings;
	
	Listings(){
		listings = new HashMap<String, Residential>();
	}
	
	@Override
	public HashMap<String, Residential> getListings() {
		// TODO Auto-generated method stub
		return listings;
	}

	@Override
	public Residential getListing(String rv) {
		return listings.get(rv);
	}

	@Override
	public Set<String> getStreetAddresses() {
		Set<String> address = listings.keySet();
		return address;
	}

	@Override
	public Collection<Residential> getResidences() {
		// TODO Auto-generated method stub
		Collection<Residential> residences = listings.values();
		return residences;
	}

	@Override
	public double getListingCount() {
		double count = listings.size();
		return count;
	}

	@Override
	public void addListing(String listing, Residential rListing) {
		listings.put(listing, rListing);
		
	}

}
