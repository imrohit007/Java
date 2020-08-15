package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        NestedForLoop();
        pyramid();
        pyramidtwo();
        foreach();
        label();

    }
    //Nested for loop

    public static void NestedForLoop(){
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.println(i + " "+ j);
            }
        }
    }

    // Pyramid type 1

    public static void pyramid(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }

    // pyramid type 2

    public static void pyramidtwo(){
        int term=6;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }

    // java for each loop

    public static void foreach(){
        int arr[] = {12,23,44,56,78};
        for(int i:arr){
            System.out.println(i);
        }
    }

    // Java lebeled for loop

    public static void label(){
        aa:
            for (int i=1;i<=3; i++){
                bb:
                    for (int j=1;j<=3;j++){
                        if(i==2&&j==2){
                            break aa;  //change aa to bb
                        }
                    System.out.println(i+" "+j);
                    }
            }
    }
}
