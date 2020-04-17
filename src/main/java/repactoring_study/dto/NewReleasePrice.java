package repactoring_study.dto;
public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	@Override
	public double getCharge(int daysRanted) {
		double result = 0;
		result +=daysRanted * 3;
		return result;
	}
	
	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}

}
