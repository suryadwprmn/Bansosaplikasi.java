package com.tutorial;

import java.util.Scanner;

public class tutorial7 {
    public static void main(String[] args) {
        float Q ;
        int m ;
        int c ;
        float t1;


        Scanner surya =
                new Scanner(System.in);
        System.out.println("Input Q");
        Q = surya.nextFloat();
        System.out.println("input m");
        m = surya.nextInt();
        System.out.println("input c");
        c = surya.nextInt();
        System.out.println("input t1");
        t1 = surya.nextFloat();
        System.out.println("hasil");
         float t0 = Q / m * c + t1;
        System.out.printf("%f/ %d * %d + %f = %f ",Q,m,c,t1,t0);

    if (t0 == 0 ){
        System.out.println("bilangan genap");
    } else if ( t0 < 100) {
        System.out.println("bilangan ganjil");
    } else {
        System.out.println("bilangan prima");
    }

    }

}
