package DateTimeAPI;

import java.time.LocalDate;
import java.util.function.Predicate;

public class DateTimeAPITest {

	public static void main(String[] args) {
		Predicate<LocalDate> datePredicate = (dateValue) -> {
			LocalDate yesterday = LocalDate.now().minusDays(1);
			return yesterday.equals(dateValue);
		};
		String date = "2021-06-13";
		LocalDate dateToCheck = LocalDate.parse(date);
		System.out.println(datePredicate.test(dateToCheck));
	}

}
