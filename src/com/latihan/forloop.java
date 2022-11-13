package com.latihan;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        int nilaiAkhir, total;
        int nilaiAwal;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai awal");
        nilaiAwal = inputan.nextInt();
        System.out.print("Masukkan nilai akhir");
        nilaiAkhir = inputan.nextInt();

        total = 0;
        System.out.println("==================");
        for (;nilaiAwal <= nilaiAkhir;){
            total = total + nilaiAwal;
            System.out.println("ditambah "+ nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }

}
