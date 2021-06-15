package DateTimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;

public class CalculatingAge {
	public static void main(String args[]) throws ParseException {
		// Reading name and date of birth from the user
		Function<String, String> ageCalFunc = (dob) -> {

			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			Date date = null;
			try {
				date = formatter.parse(dob);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Converting obtained Date object to LocalDate object
			Instant instant = date.toInstant();
			ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
			LocalDate givenDate = zone.toLocalDate();
			// Calculating the difference between given date to current date.
			Period period = Period.between(givenDate, LocalDate.now());
			return period.getYears() + " years " + period.getMonths() + " and " + period.getDays() + " days";
		};
		System.out.println(ageCalFunc.apply("23-04-1992"));
	}
}
