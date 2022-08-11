package Pt1;

import java.util.HashMap;
import java.util.Set;

public interface Biddable {

	public HashMap<String, Double> getBids();
	
	public double getBid(String bid);
	
	public Set<String> getBidders();
	
	public int getBidCount();
	
	public void newBid(String bid, double rbid);
	
}
