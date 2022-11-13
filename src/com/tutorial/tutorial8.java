package com.tutorial;

import java.util.Scanner;

public class tutorial8 {
    public static void main(String[] args) {
        int kecepatan;
        int waktu;
        Scanner mobil =
                new Scanner(System.in);
        System.out.print("Input kecepatan mobil");
        kecepatan = mobil.nextInt();
        System.out.println("km/jam");
        System.out.print("Input waktu anda ");
        waktu = mobil.nextInt();
        System.out.println("jam");
        System.out.println("Jarak yang anda tempuh adalah");
        int jarak  = kecepatan * waktu;
        System.out.println(jarak + " km");

        if (jarak <= 100){
            System.out.println("Jarak yang anda tempuh pendek");
        } else if (jarak > 100 && jarak < 250) {
            System.out.println("Jarak yang anda tempuh sedang");
        } else {
            System.out.println("Jarak yang anda tempuh sangat jauh");
        }

    }
}
