package com.latihan;
import  java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.io.IOException;

public class coba {
    public static void main(String[] args) {
          int i = 0, jumlahpesanan = 0;
          String tambahan = "YA";
          Scanner pesanan = new Scanner(System.in);
          int harga[] = new int[10];
          String menu []= new String[10];
        System.out.println("Selamat datang di Restoran Semoga Enak");
        System.out.println("Pilihan Menu : ");
        System.out.println("1.Bakso");
        System.out.println("2.Nasi Goreng");
        System.out.println("3.Mie Goreng");
        System.out.println("4.Sate Ayam ");
        System.out.println("5.Sate Kambing");
        System.out.println("6.Nasi");
        while (tambahan.equals("YA") || tambahan.equals("ya")){
            int pilihan = pesanan.nextInt();

            if(pilihan == 1){
                menu [i] = "Bakso";
                harga [i] = 10000;
            } else if(pilihan == 2){
                menu[i] = "Nasi Goreng";
                harga [i] = 12000;
            } else if (pilihan == 3) {
                menu [i] = "Mie Goreng";
                harga [i] = 15000;
            }else if (pilihan == 4){
                menu [i] = "Sate Ayam";
                harga [i] = 30000;
            }else if (pilihan == 5){
                menu [i] = "Sate Kambing";
                harga[i]= 60000;
            } else if (pilihan == 6) {
                menu [i] = "Nasi";
                harga[i] = 3000;
            } else {
                System.out.println("Menu Yang anda pilih tidak ada");
            }
        }



    }
}
