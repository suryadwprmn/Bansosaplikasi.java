package com.tutorial;

import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        int t1;
        int m;
        int c;
        int t0;
        Scanner suhu =
                new Scanner(System.in);


        System.out.println("Masukkan nilai massa");
        m = suhu.nextInt();

        System.out.println("Masukkan nilai Kalor Jenis Benda");
        c = suhu.nextInt();

        System.out.println("Masukkan nilai suhu akhir");
        t1 = suhu.nextInt();

        System.out.println("Masukkan nilai suhu mula-mula");
        t0 = suhu.nextInt();

        int Q = m*c* (t1-t0);
        System.out.printf("%d * %d (%d -%d) =%d \n " , Q, m,c,t1,t0);


    }
}
