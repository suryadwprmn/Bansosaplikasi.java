package com.baru;

public class bintang {
    public static void main(String[] args) {
        for (int i = 0; i<5;i++){
            for (int j = 0; j<5 ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("");

        for (int i = 0; i<5;i++){
            for (int j = 0; j<5 ; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for (int i = 5; i<0;i--){
            for (int j = 5; j<i ; j--){
                System.out.print("* ");

            }
            System.out.print("\n");
        }

        int n = 5;
        for ( int i = 1 ; i <= n; i++){
            for ( i = 1 ; i<= n ; i++) {
                System.out.println(" ");
            }
            for (int j= 1 ; j<= n ; j++){
                System.out.println("* ");
            }


        }


    }
}
