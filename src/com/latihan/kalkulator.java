package com.latihan;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        double a,b,hasil=0;
        int pilihan;
        String loop = "ya";
        Scanner inputanuser= new Scanner(System.in);
        System.out.println("          KALKULATOR SEDERHANA       ");
        System.out.println(" ==================================== ");

        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        System.out.println();
        System.out.println(" ===================================== ");
        System.out.println();


        while (loop.equals("ya") || loop.equals("Ya")||loop.equals("YA")) {
        System.out.println("Masukkan nilai a = ");
        a= inputanuser.nextDouble();
        System.out.println("Masukkan nilai b = ");
        b= inputanuser.nextDouble();


        System.out.println("Pilih operasi");
        pilihan = inputanuser.nextInt();
            switch (pilihan) {
                case 1:
                    hasil = a + b;
                    break;
                case 2:
                    hasil = a - b;
                    break;
                case 3:
                    hasil = a * b;
                    break;
                case 4:
                    hasil = a / b;
                    break;
                case 5:
                    hasil = a % b;
                    break;
                default:
                    System.out.println("Tidak ada di pilhan");
            }
            System.out.println("Hasil = " + hasil);
            System.out.println("Apakah anda ingin mengulangi lagi (ya/tidak)");
            loop = inputanuser.next();
        }


    }
}
