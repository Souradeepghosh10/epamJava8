package DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.TimeZone;
import java.util.function.Supplier;

public class TestCurrentTimeInEST {

	public static void main(String[] args) {

		Supplier<Date> dateSupplier = () -> {
			TimeZone.setDefault(TimeZone.getTimeZone("EST"));
			return new Date();
		};
		
		Supplier<LocalDate> dateSupplier2=()->{
			LocalDate ld = LocalDate.of(2021, Month.JUNE, 14);
			System.out.println(ld);
			return ld.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		};

		Date date = dateSupplier.get();
		LocalDate localDate = dateSupplier2.get();
		System.out.println(date);
		System.out.println(localDate);
	}

}
