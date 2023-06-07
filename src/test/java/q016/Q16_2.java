package q016;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q16_2 {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014,01,12,01,01,01,01334565456);
//		dt = dt.plusDays(30);  // assigned to dt
//		dt = dt.plusMonths(1); // assigned to dt
//		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));//2014-03-11

		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));//2014-01-12

//		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));//2014-01-12T01:01:01.192080686
	}
}
//What is the result?
//A.	An exception is thrown at runtime.  // if it was written with .parse()...
//B.	07-31-2014 										// LocalDateTime.of(2014, 7, 31, 1, 1); -- gives the format
//C.	2014-07-31  	
//D.	2014-09-30		 								// dt was not assigned as dt = dt.plus... --> false

