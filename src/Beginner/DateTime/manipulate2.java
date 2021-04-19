package Beginner.DateTime;

import java.time.LocalDate;
/*  how to take a date and manipulate it  */
public class manipulate2 {

	public static void main(String[] args) {

		//check and store today date
		LocalDate todaydate = LocalDate.now();
		System.out.println("todaydate: "+todaydate);
		
		//store specific date
		LocalDate weddingdate = LocalDate.of(2018, 03, 10);
		System.out.println("weddingdate: "+weddingdate);
		
		//Once you have a LocalDate object, you can find out the year, month, and	day with the methods getYear, getMonthValue, and getDayOfMonth:
		System.out.println(weddingdate.getMonthValue());
		
		//wht is the date 1000 days after your wedding?
		LocalDate thousandDays = weddingdate.plusDays(1000);
		System.out.println("thousand days later: "+thousandDays);
	}

}
