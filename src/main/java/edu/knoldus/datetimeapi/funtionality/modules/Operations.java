package edu.knoldus.datetimeapi.funtionality.modules;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Operations {

    public static Long calculateSecondsMGandhiLived(String birthDate, String deathDate) {
        return Duration.between(LocalDateTime.parse(birthDate), LocalDateTime.parse(deathDate)).toMinutes() * 60;
    }

    public static List<Integer> calculateLeapYearsTillDate() {
        List<Integer> listOfLeapYears = new ArrayList<>();
        LocalDate dateTill = LocalDate.now();
        LocalDate dateFrom = LocalDate.of(1900, 1, 1);
        while (dateFrom.getYear() <= dateTill.getYear()) {
            if (dateFrom.isLeapYear()) {
                listOfLeapYears.add(dateFrom.getYear());
                dateFrom = dateFrom.plusYears(4);

            } else {
                dateFrom = dateFrom.plusYears(1);
            }
        }
        return listOfLeapYears;
    }

    public static String returnTimeByTimeZone(String timeZone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "TimeZone values  are:" + zonedDateTime.format(TIME_FORMAT);
    }

    public static List<String> returnbirthDaydayOfWeek() {
        LocalDate birthDate = LocalDate.of(1994, 6, 17);
        LocalDate todayDate = LocalDate.now();
        List<LocalDate> listOfBirthdays = new ArrayList<>();
        while (birthDate.getYear() <= todayDate.getYear()) {
            listOfBirthdays.add(birthDate);
            birthDate = birthDate.plusYears(1);
        }
        return listOfBirthdays.stream()
                .map(date -> date.getDayOfWeek().toString()).collect(Collectors.toList());
    }

}
