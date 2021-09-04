package com.lax.uppgift1;

import java.util.Scanner;

public class Main {

    /*
     _   _                   _  __ _     __
    | | | |                 (_)/ _| |   /  |
    | | | |_ __  _ __   __ _ _| |_| |_  `| |
    | | | | '_ \| '_ \ / _` | |  _| __|  | |
    | |_| | |_) | |_) | (_| | | | | |_  _| |_
     \___/| .__/| .__/ \__, |_|_|  \__| \___/
          | |   | |     __/ |
          |_|   |_|    |___/

    *
    * Det här är mitt försök på uppgift 1
    * Den är kanske den mest elegantaste lösningen men det fungerar.
    *
    *
    * */

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        String choice ="";
        boolean choiceMade = false;

        Scanner input = new Scanner(System.in);

        System.out.println("type a starting number for number range");
        num1 = input.nextInt();

        System.out.println("type a ending number for number range");
        num2 = input.nextInt();

        System.out.println("type a number for how many steps in the range");
        num3 = input.nextInt();

        System.out.println("type a number for a multiple (if not just type 0)");
        num4 = input.nextInt();

        NumbersInRange numbersInRange = new NumbersInRange(num1, num2, num3, num4);

        while (!choiceMade ) {
            System.out.println("Do you want to see the result? (Press R for regular results or Press A for advanced results");
            choice = input.next();

            if (choice.equals("R")) {
                System.out.println(numbersInRange.NumbersInRangeFunction());
                choiceMade = true;
            }
            if (choice.equals("A")) {
                System.out.println(numbersInRange.NumbersInRangeFunction() + "\n" + numbersInRange.AdvancedResults());
                choiceMade = true;
            }
        }
    }


}
