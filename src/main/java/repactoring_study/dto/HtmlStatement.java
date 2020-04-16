package repactoring_study.dto;

public class HtmlStatement extends Statement{

	@Override
	String headerString(Customer aCustomer) {
		return String.format("<h1><em>%s 고객님의 대여 기록 </em></h1><p>%n", aCustomer.getName());
	}

	@Override
	String eachRentalString(Rental aEach) {
		return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	@Override
	String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <em>%s</em>%n<p>적립 포인트 : <em>%s</em><p>",aCustomer.getTotalCharge(), aCustomer.getTotalFrequentRenterPoints());
	}

}
