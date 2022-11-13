package com.latihan;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;



public class latihan {
    public static void main(String[] args) {
        Scanner pesanan = new Scanner(System.in);
        BufferedReader jumlah = new BufferedReader(new InputStreamReader(System.in));
        int jumlahpesanan = 0,i = 0;
        String tambahan = "YA";
        int harga[] = new int[10];
        String menu[] = new String[10];
        System.out.println("Selamat datang di Restoran Semoga Enak");
        System.out.println("Silahkan pilih menu :");
        System.out.println("1.Bakso");
        System.out.println("2.Nasi Goreng");
        System.out.println("3.Mie Goreng");
        System.out.println("4.Sate Ayam");
        System.out.println("5.Sate Kambing");
        System.out.println("6.Nasi");


        while (tambahan.equals("YA") || tambahan.equals("ya")) {
            System.out.println("Silahkan Pilih Menu :");
            int pilihan = pesanan.nextInt();
            if (pilihan == 1) {
                menu[i] = "Bakso";
                harga[i] = 10000;
            } else if (pilihan == 2) {
                menu[i] = "Nasi goreng";
                harga[i] = 12000;

            } else if (pilihan == 3) {
                menu[i] = "Mie goreng";
                harga[i] = 12500;
            } else if (pilihan == 4) {
                menu[i] = "Sate Ayam";
                harga[i] = 20000;

            } else if (pilihan == 5) {
                menu[i] = "Sate Kambing";
                harga[i] = 50000;

            } else if (pilihan == 6) {
                menu[i] = "Nasi";
                harga[i] = 3000;
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia");
            }
            System.out.println("Menu yang anda pilih " + menu[i]);
            System.out.println("Harga yang harus dibayarkan " + harga[i]);
            System.out.println("Apakah anda ingin menambah pesanan (YA/Tidak)");

            try {
                tambahan = jumlah.readLine();
            } catch (IOException e) {
                System.out.println("gagal");

            }
            i++;
        }
        System.out.println("");
        System.out.println("Pesanan yang anda pesan adalah");

        for(int a =0 ; a < i ; a++ ){
            System.out.println(menu[a] + "");

        }
        for (int b = 0; b < i ; b++){
            jumlahpesanan += harga[b];

        }
        System.out.println("Total biaya " + jumlahpesanan);










    }
}
