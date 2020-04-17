package repactoring_study.dto;

public class ChildredPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	@Override
	public double getCharge(int daysRanted) {
		double result = 0;
		result += 1.5;
		if(daysRanted > 3) {
			result += (daysRanted - 3) * 1.5;
		}
		return result;
	}

}
