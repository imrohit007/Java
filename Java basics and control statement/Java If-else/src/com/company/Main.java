package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.println("True");
        }

        OddEven();
        LeapYear();
        TernaryOperator();
        elseIfLadder();
        NestedIf();
    }

    // Odd Even
    public static void OddEven(){
        int number=13;
        if (number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }


    // Leap year

    public static void LeapYear(){
        int year = 2020;
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){         // && is and and || is or
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Common Year");
        }
    }

    // Ternary Operator

    public static void TernaryOperator(){
        int number=13;
        String output = (number%2==0)?"even number":"odd number";
        System.out.println(output);
    }

    //else if ladder

    public static void elseIfLadder(){
        int marks = 65;
        if (marks<50){
            System.out.println("Fail");
        }
        else if(marks>50 && marks<60){
            System.out.println("D grade");
        }
        else if(marks>=60 && marks<70){
            System.out.println("C grade");
        }
        else if(marks>=70 && marks<80){
            System.out.println("B grade");
        }
        else if(marks>=80 && marks<90){
            System.out.println("A grade");
        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");
        }else{
            System.out.println("Invalid!");
        }
    }

    // Nested If Statement

    public static void NestedIf(){
        int age=25;
        int weight=48;

        if (age>18){
            if (weight>50){
                System.out.println("You are eligible to Donate blood");
            }
            else{
                System.out.println("You are not elligible to donate blood");
            }
        }
        else{
            System.out.println("Age must be grater than 18");
        }
    }

}