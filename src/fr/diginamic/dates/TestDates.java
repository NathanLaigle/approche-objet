package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("YY/MM/dd");
		System.out.println(df.format(d));
		
		Date d2 = new Date(116, 4, 19, 23, 59, 0);
		SimpleDateFormat df2 = new SimpleDateFormat("YY/MM/dd HH:mm:ss");
		System.out.println(df2.format(d2));

	}

}
