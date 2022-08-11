package Pt1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

	@Test
	void testGetStreetAddress() {
		Property mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		assertEquals(mansion.getStreetAddress(), "352 n");
	}

	@Test
	void testGetZip() {
		Property mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		assertEquals(mansion.getZip(), "84790");
	}

	@Test
	void testSetStreetAddress() {
		Property mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		mansion.setStreetAddress("300 w");
		assertEquals(mansion.getStreetAddress(), "300 w");
	}

	@Test
	void testSetZip() {
		Property mansion = new House("352 n", 84790, 3, 2, 1900, 1);
		mansion.setZip(84770);
		assertEquals(mansion.getZip(), "84770");
	}

}
