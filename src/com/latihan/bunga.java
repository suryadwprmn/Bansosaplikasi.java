package com.latihan;

import java.util.Scanner;

public class bunga {
    public static void main(String[] args) {
        double jumlah ;// jumlah deposit pada tiap akhir tahun
        double awal ;
        double laju = 0.005;
        System.out.println("SIMULASI MENABUNG DENGAN LAJU BUNGA 0.005% SELAMA 10 TAHUN");
        System.out.println("==========================================");

        Scanner bunga = new Scanner(System.in);
        System.out.println("Masukkan uang yang anda deposit");
        awal = bunga.nextDouble();

        System.out.printf("%s %20s\n","Tahun","uang pada deposit");
        for (int tahun = 1; tahun <= 15;tahun++){


            //menghitung jumlah deposit baru pada tahun tertentu
            jumlah = awal * Math.pow(1.0 + laju, tahun);
            System.out.printf("%5d%, 20.2f\n" ,tahun, jumlah);
        }
    }
}
