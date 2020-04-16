package repactoring_study.dto;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}
	
	public String statement() {
		//double totalAmount = getTotalCharge();
		int frequentRenterPoints = 0;
		
		StringBuilder result = new StringBuilder(getName() + "고객님의 대여 기록 \n");
		
		for(Rental each:rentals) {
			
			result.append("\t"+each.getMovie().getTitle());
			result.append("\t"+String.valueOf(each.getCharge())+"\n");
			
		}
		
		
		result.append("누적 대여료 : " + String.valueOf(getTotalCharge())+"\n");
		result.append("적립 포인트 : " + String.valueOf(getTotalFrequentRenterPoints()));
		
		
		return result.toString();
	}

	private double getTotalCharge() {
		double result = 0;
		for(Rental rental : rentals) {
			result += rental.getCharge(); //Rental - getCharge()
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		for(Rental rental : rentals) {
			result += rental.getFrequentRenterPoints(); //Rental - getFrequentRenterPoints()
		}		
		return result;
	}

	
	
}
