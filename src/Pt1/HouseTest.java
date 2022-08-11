package Pt1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testGetYardAcres() {
		House house = new House("400 w", 99999, 3, 2.5, 1900, 1.5);
		assertEquals(house.getYardAcres(), 1.5);	}

	@Test
	void testSetYardAcres() {
		House house = new House("400 w", 99999, 3, 2.5, 1900, 12);
		house.setYardAcres(2);
		assertEquals(house.getYardAcres(), 2);
		}
	
	@Test
	void testCalculateAppraisalPrice() {
		House house = new House("400 w", 99999, 3, 2.5, 1900, 12);
		assertEquals(house.calculateAppraisalPrice(), 796300.0);
	}

}
