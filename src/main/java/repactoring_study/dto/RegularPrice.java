package repactoring_study.dto;

public class RegularPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
	@Override
	public double getCharge(int daysRanted) {
		double result = 0;
		result += 2;
		if(daysRanted > 2) {
			result += (daysRanted - 2) * 1.5;
		}
		return result;
	}

}
