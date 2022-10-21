package at.ac.fhcampuswien;

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
    if (daysPerWeek != 0) {
        System.out.println();
    }
    }

    public static long[] lcg(long seed) {

        long [] tenRandomNumbers = new long[10];
        double m = Math.pow(2, 31);
        int a = 1103515245;
        int c = 12345;
        long x1;

        for (int i = 0; i < 10; i++) {
            x1 =  ( (long) a * seed + (long) c) % (long) m;
            seed = x1;
            tenRandomNumbers [i]= x1;
        }
        return tenRandomNumbers;
    }

    public static void guessingGame(int numberToGuess) {

    Scanner scanner = new Scanner(System.in);
    int i;

    for (i = 1; i < 11; i++){
        System.out.print("Guess number " + i + ": ");
        int guess = scanner.nextInt();
        if (i == 10) {
            System.out.println("You lost! Have you ever heard of divide & conquer?");
            break;
        }
        else if (guess == numberToGuess) {
            System.out.println("You won wisenheimer!");
            break;
        }
        else if (guess < numberToGuess) {
            System.out.println("The number AI picked is higher than your guess.");
        }
        else {
            System.out.println("The number AI picked is lower than your guess.");
        }
    }
    }

    public static int randomNumberBetweenOneAndHundred() {

        Random r = new Random();
        return (r.nextInt(100) + 1);
    }

    public static boolean swapArrays(int[] arrayOne, int[] arrayTwo) {

        if (arrayOne.length != arrayTwo.length) {
            return false;
        }

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = arrayOne[i] + arrayTwo[i];
            arrayTwo[i] = arrayOne[i] - arrayTwo[i];
            arrayOne[i] = arrayOne[i] - arrayTwo[i];
        }
        return true;
    }

    public static String camelCase(String s) {
        String string = "?";
        return string;
    }

    public static int checkDigit(int[] code) {

    int weight = 0;
    int check;

    for (int position = 0; position < code.length; position++) {
        weight = weight + code[position] * (position+2);
    }

    check = 11 - (weight % 11);

    if (check == 10) {
        return 0;
    }
    else if (check == 11) {
        return 5;
    }
    return check;
    }

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}