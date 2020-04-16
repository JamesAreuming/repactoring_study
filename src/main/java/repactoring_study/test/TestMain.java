package repactoring_study.test;

import repactoring_study.dto.Customer;
import repactoring_study.dto.Movie;
import repactoring_study.dto.Rental;

public class TestMain {

	public static void main(String[] args) {
		Movie mc1 = new Movie("니모를 찾아서", Movie.CHILDRENS);
		Movie mc2 = new Movie("말레피센트", Movie.CHILDRENS);
		Movie mr1 = new Movie("명량", Movie.REGULAR);
		Movie mr2 = new Movie("변호사", Movie.REGULAR);
		Movie mn1 = new Movie("곡성", Movie.NEW_RELEASE); //최신
		Movie mn2 = new Movie("인디펜던스데이", Movie.NEW_RELEASE); //최신
		
		Rental r1 = new Rental(mc1, 3);
		Rental r2 = new Rental(mc2, 4);
		Rental r3 = new Rental(mr1, 2);
		Rental r4 = new Rental(mr2, 3);
		Rental r5 = new Rental(mn1, 2);
		Rental r6 = new Rental(mn2, 3);
		
		Customer c = new Customer("정아름");
		
		c.addRental(r1); //아동
		c.addRental(r3); //일반
		c.addRental(r5); //최신
		// 포인트 : 1+1+(2) = 4
		
		Customer c1 = new Customer("정미녀");
		
		c1.addRental(r2); //아동
		c1.addRental(r4); //일반
		c1.addRental(r6); //최신
		// 포인트 : 1+1+(2) = 4
		
		System.out.println(c.statement());
		System.out.println("***************************************************");
		System.out.println(c1.statement());
		
	}

}
