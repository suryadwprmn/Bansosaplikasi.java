package com.tutorial;

import java.util.Scanner;

public class nama {
    public static void main(String[] args) {
        String[] mahasiswa = new String[5];


        Scanner inputanuser = new Scanner(System.in);
        System.out.println("Masukkan nama Mahasiswa");
        for (int i = 0; i <= mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke  " + (i+1) + " :");
            mahasiswa[i] = inputanuser.nextLine();

        }
    }

}

