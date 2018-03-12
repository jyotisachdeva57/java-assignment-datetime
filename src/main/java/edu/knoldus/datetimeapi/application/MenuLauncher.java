package edu.knoldus.datetimeapi.application;

import edu.knoldus.datetimeapi.funtionality.modules.Operations;

public class MenuLauncher {
    public static void main(String args[]) {
        String birthDate = "1869-10-02T00:00:00";
        String deathDate = "1948-01-30T00:00:00";
        System.out.println("Mahatama Gandhi Lived for these seconds:");
        System.out.println(Operations.calculateSecondsMGandhiLived(birthDate, deathDate));
        System.out.println("Leap Years till Date are:");
        System.out.println(Operations.calculateLeapYearsTillDate());
        System.out.println("Time by time zone:");
        System.out.println(Operations.returnTimeByTimeZone("Europe/Copenhagen"));
        System.out.println("Birthday day of week:");
        System.out.println(Operations.returnbirthDaydayOfWeek());
    }
}
