package Pt1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable {

	//work
	public HashMap<String, Residential> getListings();
	
	public  Residential getListing(String rv);
	
	public Set<String> getStreetAddresses();
	
	public Collection<Residential> getResidences();
	
	public double getListingCount();
	
	public void addListing(String listing, Residential rListing);
	
	
	
	
	
}
