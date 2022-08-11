package Pt1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testGetfloorLvl() {
		Condo condo = new Condo("400 w", 99999, 3, 2.5, 1900, 12);
		assertEquals(condo.getfloorLvl(), 12);
	}

	@Test
	void testSetFloorLvl() {
		Condo condo = new Condo("400 w", 99999, 3, 2.5, 1900, 12);
		condo.setFloorLvl(2);
		assertEquals(condo.getfloorLvl(), 2);	
		}
	
	@Test
	void testCalculateAppraisalPrice() {
		Condo condo = new Condo("400 w", 99999, 3, 2.5, 1900, 12);
		assertEquals(condo.calculateAppraisalPrice(), 276200.0);
	}

}
