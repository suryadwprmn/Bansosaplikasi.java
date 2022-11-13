package com.latihan;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        // 1. buat integer
        int angka;
        int faktorial = 1;

        //2. looping

        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukkan angka = ");
        angka = inputan.nextInt();
        for (int a = 1; a <= angka ;a++){
            faktorial *=a;
        }
        //3. akhir dari looping
        System.out.println( "Hasil Dari " + faktorial);

    }



}
