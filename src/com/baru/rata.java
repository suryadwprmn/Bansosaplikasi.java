package com.baru;

import java.util.Scanner;

public class rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Jumlah Siswa");
        int n = input.nextInt();

        String siswa[] = new String[n];
        int nilaiAgama [] = new int[n];
        int nilaiMtk [] = new int [n];
        int nilaiIpa [] = new int[n];
        int nilai [] = new int [n];
        String status [] = new String[n];

        for (int i = 0; i < n; i++){
            System.out.println("Siswa ke " + (i+1));
            System.out.print("Nama : ");
            siswa[i]= input.next();
            int a = 0;
            System.out.print("Nilai Agama = ");
            nilaiAgama[a] = input.nextInt();
            System.out.print("Nilai Matematika = ");
            nilaiMtk[a] = input.nextInt();
            System.out.print("Nilai IPA = ");
            nilaiIpa[a] = input.nextInt();

            int range = (nilaiMtk[a] +nilaiAgama[a] + nilaiIpa[a])/3 ;
            if (range < 70){
                status[i] = "Maaf Anda Tidak Lulus";
            } else {
                status[i] = "Anda Lulus";
            }

            System.out.println("Jumlah rata -rata " + range + " dan dinyatakan " + status[i]);
        }







    }
}
