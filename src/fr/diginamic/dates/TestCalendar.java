package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2016, 4, 19, 23, 59, 30);

		SimpleDateFormat df = new SimpleDateFormat("YY MMM ddd", Locale.FRANCE);
		SimpleDateFormat df2 = new SimpleDateFormat("YY MMM ddd", Locale.CHINA);
		SimpleDateFormat df3 = new SimpleDateFormat("YY MMM ddd", Locale.ENGLISH);
		// System.out.println(df.format(c.getTime()));

		Calendar today = Calendar.getInstance();
		System.out.println(df.format(c.getTime()));
		System.out.println(df2.format(c.getTime()));
		System.out.println(df3.format(c.getTime()));
		
	}
}
