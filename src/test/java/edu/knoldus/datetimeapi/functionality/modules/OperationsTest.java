package edu.knoldus.datetimeapi.functionality.modules;


import edu.knoldus.datetimeapi.funtionality.modules.Operations;
import org.junit.Test;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class OperationsTest {

    @Test
    public void shouldReturnLeapYearsStartingFrom1900() {

        List<Integer> expectedResult = Arrays.asList(1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016);
        List<Integer> actualResult = Operations.calculateLeapYearsTillDate();
        assertEquals("check list of valid leap years", actualResult, expectedResult);
    }


    @Test
    public void shouldReturnTimeOfZone() {
        String timeZone = "Europe/Copenhagen";
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
        String expectedResult = zonedDateTime.format(TIME_FORMAT);
        String actualResult = Operations.returnTimeByTimeZone(timeZone);
        assertEquals("check time zone", actualResult, expectedResult);
    }


    @Test
    public void shouldReturnSecondsMahatamaGandhiLived() {

        String birthDate = "1869-10-02T00:00:00";
        String deathDate = "1948-01-30T00:00:00";
        Long expectedResult = 2471731200L;
        Long actualResult = Operations.calculateSecondsMGandhiLived(birthDate, deathDate);
        assertEquals("check seconds for which Gandhi ji lived", actualResult, expectedResult);

    }

    @Test
    public void shouldReturnListOfBirthDaysTillNow() {
        List<String> expectedResult = Arrays.asList("FRIDAY","SATURDAY","MONDAY","TUESDAY","WEDNESDAY", "THURSDAY", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "FRIDAY", "SATURDAY", "SUNDAY");
        List<String> actualResult = Operations.returnbirthDayOfWeek();
        assertEquals("did not return required list",actualResult,expectedResult);
    }

}