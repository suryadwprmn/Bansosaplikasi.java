package com.latihan;

import java.util.Scanner;

public class hitung {
    public static void main(String[] args) {
        String nama ;


        Scanner jumlah = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        nama = jumlah.next();
        int menghitung  = nama.length();
        System.out.println("Jumlah Karakter Huruf " + menghitung);
        menghitung = jumlah.nextInt();


    }
}
