package com.latihan;

import java.util.Scanner;

public class keliling {

    public void tampil (String ucap){
        System.out.println(ucap);

    }
    public int tambah(int angka1, int angka2){
        int hasil = angka1 +angka2;

        return hasil;
    }
    public static void main(String[] args) {
        keliling belajar = new keliling();
        belajar.tampil(  "Matematika Pertambahan");
        Scanner inputuser = new Scanner(System.in);

        System.out.print("Masukkan angka 1 = ");
        int bil1= inputuser.nextInt();
        System.out.print("Masukkan angka 2 = ");
        int bil2 = inputuser.nextInt();
        System.out.println("Hasil dari "+bil1+" + " +bil2 +" = "+belajar.tambah(bil1,bil2) );



    }
}
