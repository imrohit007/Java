package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number = 20;

        switch (number) {
            case 10:
                System.out.println("10");
                break;

            case 20:
                System.out.println("20");
                break;

            case 30:
                System.out.println("30");
                break;

            default:
                System.out.println("Not in 10,20 or 30");
        }
    months();
    breaknot();
    nested();
    enumm();
    }


    // finding months

    public static void months() {

        int month=7;
        String monthString ="";

        switch (month){
            case 1: monthString="1 - January";
                break;
            case 2: monthString="2 - February";
                break;
            case 3: monthString="3 - March";
                break;
            case 4: monthString="4 - April";
                break;
            case 5: monthString="5 - May";
                break;
            case 6: monthString="6 - June";
                break;
            case 7: monthString="7 - July";
                break;
            case 8: monthString="8 - August";
                break;
            case 9: monthString="9 - September";
                break;
            case 10: monthString="10 - October";
                break;
            case 11: monthString="11 - November";
                break;
            case 12: monthString="12 - December";
                break;
            default:System.out.println("Invalid Month!");
        }
        System.out.println(monthString);
    }

    // The Java switch statement is fall-through. It means it executes all statements after the first match if a break statement is not present.

    public static void breaknot(){
        int number = 20;
        switch (number){
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            default:System.out.println("Not in 10, 20 or 30");
        }
    }

    // nested switch

    public static void nested(){
        char branch = 'C';
        int collegeYear = 4;
        switch (collegeYear){
            case 1:
                System.out.println("English, maths, science");
                break;
            case 2:
                switch (branch){
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
    }

    //Java allows us to use enum in switch statement.

    public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat};
    public static void enumm(){
        Day[]DayNow = Day.values();
        for(Day Now: DayNow){
            switch (Now){
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
