package com.baru;

import java.util.Scanner;

public class kelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jumlah Mahasiswa");
        int n = input.nextInt();

        String mahasiswa[]=new String[n];
        String status [] = new  String[n];
        int nilai[]= new int[n];

        for (int i = 0; i <n ; i++){
            System.out.println("Mahasiswa Ke " + (i+1));
            System.out.print("Nama ");
            mahasiswa[i] = input.next();

            System.out.print("Nilai ");
            nilai[i] =input.nextInt();

            if (nilai[i] < 75 ){
                status[i] = "Tidak Lulus" ;
            }else {
                status[i] = "Lulus";
            }
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("=======================");
        System.out.printf("%s %5s\n","No","Nama   " + "   Nilai  " + "  Status");

        for (int i = 0; i < n ; i++){
            System.out.println((i+1)+"    " + mahasiswa[i] +"     " + nilai[i] +"        "  + status[i]);
        }



    }
}
