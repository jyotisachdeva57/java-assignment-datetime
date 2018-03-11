package edu.knoldus.datetimeapi.funtionality.modules;

import java.time.*;
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
                dateFrom=dateFrom.plusYears(4);

            }
            else {
                dateFrom = dateFrom.plusYears(1);
            }
        }
        return listOfLeapYears;
    }
    public static String returnTimeByTimeZone(String timeZone) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        return "TimeZone values  are:" + zonedDateTime;
    }

    public static List<String> returnbirthDaydayOfWeek() {
        LocalDate birthDate = LocalDate.of(1994, 6, 17);
        LocalDate todayDate = LocalDate.now();

        List<LocalDate> listOfBirthdaydays = new ArrayList<>();
        while (birthDate.getYear() <= todayDate.getYear()) {
            listOfBirthdaydays.add(birthDate);
            birthDate = birthDate.plusYears(1);
        }
        return listOfBirthdaydays.stream()
                .map(date -> date.getDayOfWeek().toString()).collect(Collectors.toList());
    }





}
