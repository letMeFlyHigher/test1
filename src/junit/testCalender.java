package junit;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class testCalender {

	@Test
	public void testCal(){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getTime());
	}
}
