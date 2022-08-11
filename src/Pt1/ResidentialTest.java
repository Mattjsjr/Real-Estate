package Pt1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetBedCount() {
		Residential mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		assertEquals(mansion.getBedCount(), 3);
	}

	@Test
	void testGetBathCount() {
		Residential mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		assertEquals(mansion.getBathCount(), 2);
	}

	@Test
	void testSqFootage() {
		Residential mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		assertEquals(mansion.getSqFootage(), 1900);
	}

	@Test
	void testSetSqFootage() {
		Residential mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		mansion.setSqFootage(1000);
		assertEquals(mansion.getSqFootage(), 1000);
	}

	@Test
	void testSetBathCount() {
		Residential mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		mansion.setBathCount(3.5);
		assertEquals(mansion.getBathCount(), 3.5);
	}

	@Test
	void testSetBedCount() {
		Residential mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		mansion.setBedCount(6);
		assertEquals(mansion.getBedCount(), 6);
	}

}
