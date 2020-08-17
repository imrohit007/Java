package com.company;

public class Main {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.println(n1 + " " + n2); // printing 0 and 1

		for (i = 2; i < count; ++i) {     // loop starts from 2 because 0 and 1 are already printed
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	// method 2.... commenting it out because two main method in same class
	// but  the code is correct

/*
    static int n1=0,n2=1,n3=0;
    static void me2(int count){
		if (count>0){
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" "+n3);
			me2(count-1);


		}
	}
	public static void main(String[] args){
    	int count=10;
    	System.out.println(n1+" "+n2);
    	me2(count-2);
	}

 */
}
