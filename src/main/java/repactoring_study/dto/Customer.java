package repactoring_study.dto;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Rental> getRentals() {
		return this.rentals;
	}

	public String statement() {
		return new TextStatement().value(this);
	}
	
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}

	public double getTotalCharge() {
		double result = 0;
		for(Rental rental : rentals) {
			result += rental.getCharge(); //Rental - getCharge()
		}
		return result;
	}
	
	public int getTotalFrequentRenterPoints() {
		int result = 0;
		for(Rental rental : rentals) {
			result += rental.getFrequentRenterPoints(); //Rental - getFrequentRenterPoints()
		}		
		return result;
	}

	
	
}
