package Pt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class reo {

	static Listings map = new Listings();
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean valid = false;

		do {

			System.out.println("\n--------------------------");
			System.out.println("         Main Menu        ");
			System.out.println("---------------------------");
			System.out.println("1:Listings\n2:Bids");

			System.out.println("What would you like to do? (1-2): ");
			String input = scan.nextLine();

			switch (input) {

			case "1":
				listingProperty();
				break;

			case "2":
				bidsMenu();
				break;

			default:
				System.out.println("Please enter either 1 or 2");
				break;

			}
		} while (!valid);

		System.out.println(map.toString());

	}// end of main

	private static void listingProperty() {
		Scanner scan = new Scanner(System.in);
		String answer;

		System.out.println("\n--------------------------");
		System.out.println("        Listing Menu        ");
		System.out.println("--------------------------");
		System.out.println("1:Add Listing\n2:ShowListings\n3:Auto Populate Listings (Dev tool)"
				+ "\nENTER: Exit back to previous menu\n\nWhat would you like to do?(1-3):");

		boolean valid = false;

		while (!valid) {
			answer = scan.nextLine();
			switch (answer) {

			case "1":
				addListings();
				break;

			case "2":
				showListings();
				break;

			case "3":
				autoPopulate();
				break;

			case "":
				main(null);
				break;

			default:
				System.out.println("Please enter numbers 1-3");
				break;
			}// end of switch Statement
		} // end of while loop

	}// end of listingProperty

	private static Property addListings() {

		Scanner scan = new Scanner(System.in);
		String answer;
		boolean valid = false;

		System.out.println("\n--------------------------");
		System.out.println("      Add Listing Menu      ");
		System.out.println("--------------------------");
		System.out.println(
				"1:Add House\n2:Add Condo\nENTER: Exit back to previous menu\n\n" + "What would you like to do?(1-2):");

		while (!valid) {
			answer = scan.nextLine();
			switch (answer) {

			case "1":
				addHouse();
				map.toString();
				break;

			case "2":
				addCondo();
				map.toString();
				break;

			case "":
				listingProperty();
				break;

			default:
				System.out.println("Please enter Either 1 or 2");
				break;
			}// end of switch

		} // end of while

		return null;
	}// end of addListing

	private static Residential addHouse() {

		Scanner scan = new Scanner(System.in);

		String finalOutput = "";
		String answer = "";
		String streetAddress = "";
		int zipcode = 0;
		int bedCount = 0;
		double bathCount = 0.0;
		double sqFootage = 0.0;
		double yardAcres = 0.0;
		double listPrice = 0.0;

		House house = new House();

		boolean valid = false;
		while (!valid) {
			System.out.println("Please enter the street address for the residence: ");
			answer = scan.nextLine();

			try {
				house.setStreetAddress(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid address");
			} // end of try and catch statement.
		} // end of while loop

		boolean valid2 = false;
		while (!valid2) {
			System.out.println("Please Enter the zipcode for the residence: ");
			answer = scan.nextLine();

			try {
				zipcode = Integer.parseInt(answer);
				valid2 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid zipcode");
			} // end of try/catch
		} // end of while loop
		house.setZip(zipcode);

		boolean valid3 = false;
		while (!valid3) {
			System.out.println("Please enter the number of bedrooms: ");
			answer = scan.nextLine();

			try {
				bedCount = Integer.parseInt(answer);
				valid3 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid bedroom count");
			} // end of try/catch
		} // end of while loop

		house.setBedCount(bedCount);

		boolean valid4 = false;
		while (!valid4) {
			System.out.println("Please enter the number of bathrooms: ");
			answer = scan.nextLine();

			try {
				bathCount = Double.parseDouble(answer);
				valid4 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid bathroom count");
			} // try/catch
		} // end of while loop
		house.setBathCount(bathCount);

		boolean valid5 = false;
		while (!valid5) {
			System.out.println("Please enter the square footage of the residence: ");
			answer = scan.nextLine();

			try {
				sqFootage = Double.parseDouble(answer);
				valid5 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid Square Footage");
			}
		} // end of while(!valid5)

		house.setSqFootage(sqFootage);

		boolean valid6 = false;
		while (!valid6) {
			System.out.println("Please enter the size of the yard in acres: ");
			answer = scan.nextLine();

			try {
				yardAcres = Double.parseDouble(answer);
				valid6 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid answer");
			} // end of try/catch

		} // end of while loop
		house.setYardAcres(yardAcres);

		boolean valid7 = false;
		while (!valid7) {

			finalOutput += "\n-------------------------------------------------------------------------------------------------------";
			finalOutput += String.format("%nResidence Type: House           Address: %s           Zip Code: %d",
					house.getStreetAddress(), house.getZip());
			finalOutput += "\n-------------------------------------------------------------------------------------------------------";
			finalOutput += String.format("%nSq Footage: %.2f", house.getSqFootage());
			finalOutput += String.format("%nBedrooms: %d", house.getBedCount());
			finalOutput += String.format("%nBathrooms: %.1f", house.getBathCount());
			finalOutput += String.format("%nYard Size (Acres): %.2f", house.getYardAcres());
			finalOutput += "\n------------------------------------------";
			finalOutput += String.format("%nAppraisal Price: $%.2f", house.calculateAppraisalPrice());
			finalOutput += "\nPlease enter the List Price for the property: ";
			System.out.println(finalOutput);
			answer = scan.nextLine();

			try {
				listPrice = Double.parseDouble(answer);
				valid7 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid answer");
			} // end of catch

		} // end of while(!valid7)

		System.out.println("Congratulations! you have created a new listing!");

		house = new House(house.getStreetAddress(), house.getZip(), house.getBedCount(), house.getBathCount(),
				house.getSqFootage(), house.getYardAcres());
		house.setListPrice(listPrice);
		map.addListing(house.getStreetAddress(), house);
		return house;
	}// end of addHouse()

	private static Residential addCondo() {

		Scanner scan = new Scanner(System.in);

		String finalOutput = "";
		String answer = "";
		String streetAddress = "";
		int zipcode = 0;
		int bedCount = 0;
		double bathCount = 0.0;
		double sqFootage = 0.0;
		int floorLvl = 0;
		double listPrice = 0.0;

		Condo condo = new Condo();

		boolean valid = false;
		while (!valid) {
			System.out.println("Please enter the street address for the residence: ");
			answer = scan.nextLine();

			try {
				condo.setStreetAddress(answer);
				valid = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid address");
			} // end of try and catch statement.
		} // end of while loop

		boolean valid2 = false;
		while (!valid2) {
			System.out.println("Please Enter the zipcode for the residence: ");
			answer = scan.nextLine();

			try {
				zipcode = Integer.parseInt(answer);
				valid2 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid zipcode");
			} // end of try/catch
		} // end of while loop
		condo.setZip(zipcode);

		boolean valid3 = false;
		while (!valid3) {
			System.out.println("Please enter the number of bedrooms: ");
			answer = scan.nextLine();

			try {
				bedCount = Integer.parseInt(answer);
				valid3 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid bedroom count");
			} // end of try/catch
		} // end of while loop

		condo.setBedCount(bedCount);

		boolean valid4 = false;
		while (!valid4) {
			System.out.println("Please enter the number of bathrooms: ");
			answer = scan.nextLine();

			try {
				bathCount = Double.parseDouble(answer);
				valid4 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid bathroom count");
			} // try/catch
		} // end of while loop
		condo.setBathCount(bathCount);

		boolean valid5 = false;
		while (!valid5) {
			System.out.println("Please enter the square footage of the residence: ");
			answer = scan.nextLine();

			try {
				sqFootage = Double.parseDouble(answer);
				valid5 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid Square Footage");
			}
		} // end of while(!valid5)

		condo.setSqFootage(sqFootage);

		boolean valid6 = false;
		while (!valid6) {
			System.out.println("Please enter the floor level: ");
			answer = scan.nextLine();

			try {
				floorLvl = Integer.parseInt(answer);
				valid6 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid answer");
			} // end of try/catch

		} // end of while loop
		condo.setFloorLvl(floorLvl);

		boolean valid7 = false;
		while (!valid7) {

			finalOutput += "\n-------------------------------------------------------------------------------------------------------";
			finalOutput += String.format("%nResidence Type: House           Address: %s           Zip Code: %d",
					condo.getStreetAddress(), condo.getZip());
			finalOutput += "\n-------------------------------------------------------------------------------------------------------";
			finalOutput += String.format("%nSq Footage: %.2f", condo.getSqFootage());
			finalOutput += String.format("%nBedrooms: %d", condo.getBedCount());
			finalOutput += String.format("%nBathrooms: %.1f", condo.getBathCount());
			finalOutput += String.format("%nYard Size (Acres): %d", condo.getfloorLvl());
			finalOutput += "\n------------------------------------------";
			finalOutput += String.format("%nAppraisal Price: $%.2f", condo.calculateAppraisalPrice());
			finalOutput += "\nPlease enter the List Price for the property: ";
			System.out.println(finalOutput);
			answer = scan.nextLine();

			try {
				listPrice = Double.parseDouble(answer);
				valid7 = true;
			} catch (Exception e) {
				System.out.println("Please enter a valid answer");
			} // end of catch

		} // end of while(!valid7)

		System.out.println("Congratulations! You've created a new listing!");
		condo = new Condo(condo.getStreetAddress(), condo.getZip(), condo.getBedCount(), condo.getBathCount(),
				condo.getSqFootage(), condo.getfloorLvl());
		condo.setListPrice(listPrice);
		map.addListing(streetAddress, condo);
		return condo;
	}

	public static void showListings() {
		int num = 1;

		for (String key : map.getStreetAddresses()) {
			System.out.println("\n\n\nListing No: " + num);
			System.out.printf("%s", map.getResidences());
			num++;
		}
	}

	public static void autoPopulate() {

		House house1 = new House("34 Elm", 95129, 3, 2, 2200, .2);
		house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
		map.addListing("34 Elm", house1);
		House house2 = new House("42 Hitchhikers", 95136, 4, 3, 2800, .3);
		house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
		map.addListing("42 Hitchhikers", house2);
		Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
		condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
		map.addListing("4876 Industrial", condo1);
		House house3 = new House("2654 Oak", 84062, 5, 53, 4200, .5);
		house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
		map.addListing("2654 Oak", house3);
		Condo condo2 = new Condo("9875 Lexington", 84063, 2, 1, 1500, 1);
		condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
		map.addListing("9875 Lexington", condo2);
		House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
		house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
		map.addListing("7608 Glenwood", house4);
		House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
		house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
		map.addListing("1220 Apple", house5);

		System.out.println("8 residences have been added to the listings for testing purposes.");

	}

	public static void bidsMenu() {

		Scanner scan = new Scanner(System.in);
		String answer = "";

		System.out.println("\n--------------------------");
		System.out.println("      Add Listing Menu      ");
		System.out.println("--------------------------");
		System.out.println(
				"1:Add New Bid\n2:Show Existing Bids\n3:Auto Populate Bids(Dev Tool)\nENTER: Exit back to previous menu\n\n"
						+ "What would you like to do?(1-3):");

		boolean valid = false;

		while (!valid) {
			answer = scan.nextLine();
			switch (answer) {

			case "1":
				addBid();
				break;

			case "2":
				showBids();
				break;

			case "3":
				autoBids();

			case "":
				main(null);
				break;

			default:
				System.out.println("Please enter Either 1 or 2");
				break;
			}// end of switch

		} // end of while
	}// end of bidMenu()

	public static void showBids() {
		ArrayList <Residential> res = new ArrayList<Residential>();

		int num = 1;
		String finalOutput = "";

		System.out.println("No.      Property(Bids)");
		System.out.println("-----------------------");

		for (String key : map.getStreetAddresses()) {
			System.out.printf("%n%d:      %s(%d)", num, map.getListing(key).getStreetAddress(), map.getListing(key).getBidCount());
			res.add(map.getListing(key));
			num++;
		}

	}// end of showBids()

	public static void autoBids() {
		String[] autoBidders = { "Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy",
				"DeForect Kelley", "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank",
				"Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton",
				"Colm Meaney", "Michelle Forbes" };

//Create an object of type Random,  r

		Random r = new Random();

//Randomly select a number between 0 and the length of the autoBidders list - 1.  This will be your random index into the array

		int index = r.nextInt((autoBidders.length - 1) + 1);

//Use the random index number to select a random bidder and use the appraisal price * some percentage to generate a bid amount.

		for(String key : map.getStreetAddresses()) {
		
		map.getListing(key).newBid(autoBidders[index], map.getListing(key).calculateAppraisalPrice() * 1.03);
		}
	}
	
	public static Residential addBid() {
		Scanner scan = new Scanner(System.in);
		double answer = 0;
		boolean valid = false;
		
		while(!valid) {
		
		showBids();
		System.out.println("\nFor which property would you like to add a bid?: ");
		answer = scan.nextDouble();
		
		try {
			map.getStreetAddresses().toString();
		}catch(Exception e) {
			System.out.println("Please enter something valid");
		}
		}
		return null;
		
	}



}// end of reo
