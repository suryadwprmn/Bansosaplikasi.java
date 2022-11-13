package com.latihan;

import java.util.Scanner;

public class minibank {
    public static void main(String[] args) {
        int saldo,penambahan,penarikan,pemindahan,pilihan,saldoawal= 1000000;
        String loop ="ya";
        int saldoakhir = 0;

        Scanner inputan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI BANK SURYA");
        System.out.println("PIlihan Menu");
        System.out.println("1.Penarikan");
        System.out.println("2.Penambahan Saldo");
        System.out.println("3.Pemindahan");
        System.out.println("4.Cek Saldo");


        while (loop.equals("ya")) {
            System.out.print("Pilihan anda");
            pilihan = inputan.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Berapa saldo yang ingin anda tarik");
                    penarikan = inputan.nextInt();
                    saldoakhir = saldoawal - penarikan;

                    break;
                case 2:
                    System.out.println("Berapa saldo yang ingin anda tambahkan");
                    penambahan = inputan.nextInt();
                    saldoakhir = saldoawal + penambahan;

                    break;
                case 3:
                    System.out.println("Berapa saldo yang ingin anda pindah");
                    pemindahan = inputan.nextInt();
                    saldoakhir = saldoawal - pemindahan;
                case 4 :
                    System.out.println("Saldo anda sekarang");
                    System.out.println(saldoawal);
                default:
                    System.out.println("Pilihan yang anda pilih tidak ada");

                saldoakhir++;
            }


            System.out.println("Apakah anda ingin melanjutkan transaksi" );
            loop = inputan.next();

        }
        System.out.println("Saldo anda sekarang " + saldoakhir);
    }
}
