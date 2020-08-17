package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("First Random Number "+ Math.random()); //it will print number between 0 and 1.
	    System.out.println("Second Ranndom Number"+ Math.random());

	    // contrain random number
        int min=200;
        int max=400;
        System.out.println("Random Number between "+min+" to "+max);
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);
        System.out.println("Random value of type int between "+min+" to "+max+ ":");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
