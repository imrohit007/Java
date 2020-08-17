package com.company;
import  java.util.Scanner;
public class Main {

    // Here the input is predefined
    /*
    public static void main(String[] args) {
	    int i,m=0, flag=0;
	    int n=19; // input value
        m=n/2;
        if (n==0||n==1){
            System.out.println(n+" is not prime number");
        }
        else{
            for (i=2;i<=m;i++){
                if (n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                            break;

                }
            }
            if(flag==0){System.out.println(n+" is a prime number");}
        }
    }

     */


    // method 2.. take the input
    /*
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = s.nextInt();
        if (isPrime(n)){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2; i<Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

     */

    // prime number between two given numbers

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int start = s.nextInt();
        System.out.println("Enter the second number");
        int end = s.nextInt();
        System.out.println(" List of the prime number between "+ start+" and "+end);
        for (int i=start;i<=end;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if (n<=1){
            return  false;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return  false;
            }
        }
        return  true;
    }
}
