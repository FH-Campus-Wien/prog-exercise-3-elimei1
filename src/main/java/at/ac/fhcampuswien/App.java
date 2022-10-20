package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int firstDay) {

    int daysPerWeek = firstDay - 1;
    int space;
    int calendarDays;

    for (space = 1; space <= 3*(firstDay-1); space++) {
        System.out.print(" ");
        }

    for (calendarDays =1; calendarDays <=days; calendarDays++) {
        System.out.printf("%2d", calendarDays);
        System.out.print(" ");
        daysPerWeek++;
        if (daysPerWeek == 7) {
            System.out.println();
            daysPerWeek = 0;
        }
    }
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}