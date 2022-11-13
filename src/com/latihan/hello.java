package com.latihan;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner persegipanjang = new Scanner(System.in);
        double panjang,luas,lebar;
        System.out.println("Menghitung luas persegi");
        System.out.print("Masukkan panjang = " );
        panjang = persegipanjang.nextDouble();


        System.out.print("Masukkan lebar = ");
        lebar = persegipanjang.nextDouble();

        luas = panjang * lebar;
        System.out.println("Luas persegi = " + luas + " cm");

        if(luas > 600){
            System.out.println("Luas Sekali");
        } else {
            System.out.println("Luasnya sangat pendek");
        }

        Scanner kecepatanmotor = new Scanner(System.in);;
        double jarak, kecepatan, waktu;
        System.out.println("============================");
        System.out.println("Menghitung kecepatan sepeda motor");
        System.out.print("Masukkan jarak dalam km =");
        jarak = kecepatanmotor.nextDouble();
        System.out.print("Masukkan waktu dalam jam  = ");
        waktu = kecepatanmotor.nextDouble();

        kecepatan = jarak/waktu;
        System.out.println("kecepatan yang anda pacu " + kecepatan + " km/jam");

        if ( kecepatan >= 100) {
            System.out.println("anda mengendarai kendaraan sangat cepat");
        } else {
            System.out.println("anda menngendarai kendaraan dalam kecepatan normal ");
        }


        Scanner volumetabung = new Scanner(System.in);
        double r, t;
        double pi = 3.14;
        double volume;
        System.out.println("========================");
        System.out.println("menghitung volume tabung");
        System.out.print("masukkan  jari-jari (cm) =");
        r = volumetabung.nextDouble();
        System.out.print("masukkan tinggi (cm) =");
        t =volumetabung.nextDouble();
        volume = pi * r * r *t;
        System.out.printf("volume = %f * %f * %f * %f = %f \n", pi,r,r,t,volume);

    }
}
