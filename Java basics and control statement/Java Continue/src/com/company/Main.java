package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
        forcontinue();
    }


    // It continues inner loop only if you use the continue statement inside the inner loop.

    public static void forcontinue(){
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                if (i==2 && j==2){
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
// Same as for while and Do-while loop.