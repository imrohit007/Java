package com.company;

public class Main {

    public static void main(String[] args) {
	    int c=0,a,temp;
	    int n=153;     // number to check
        temp = n;
        while (n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);

        }
        if (temp==c){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("No Armstrong Number");
        }

    }
}
