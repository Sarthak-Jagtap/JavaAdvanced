package DateTime;

import java.time.LocalDate;

public class DateTimeDemo {
	public static void main(String[] args) {
		
		/// LocalDate and LocalTime are 
		/// i. thread safe
		/// ii. immutable
		/// iii. easy to use
		/// iv. has many methods than old Date class
		
		LocalDate date = LocalDate.of(2003, 10, 22);
		System.out.println(date);
		
		LocalDate dateNow = LocalDate.now();
		System.out.println(dateNow);
		
		/// Format is important
		LocalDate dateParse = LocalDate.parse("1000-10-10");
		System.out.println(dateParse);
		
		
		System.out.println(dateParse.getDayOfWeek());
		
		///Similarly LocalTime
	
	}
}
