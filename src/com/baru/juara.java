package com.baru;

import java.util.Scanner;

public class juara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Nama Mahasiswa : ");
        int n = input.nextInt();


        //Deklarasi Array
        String kata[] = new String[n];

        //Input data ke array
        for (int i = 0; i < kata.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + " : ");

            kata[i] = input.next();

            for (int b = 0; b < kata.length; b++) {
                System.out.println("jurusan " + (b + 1) + " : ");
                kata[b] = input.next();


                //menampilkan data dalam array



            }
        }
        System.out.println("Mahasiwa ");
    }
}

