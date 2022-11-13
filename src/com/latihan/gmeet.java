package com.latihan;

import java.util.Scanner;

public class gmeet {
    public  static Scanner inputuser = new Scanner(System.in);
    public static String[] namaMataKuliah = { "Kalkulus", "Konsep Teknologi Informasi","Bahasa Indonesia"
    };

    public static void main(String[] args) {
        System.out.println("\n");
        String data =input("Masukkan nama: ");


        System.out.println(data);


    }
    public static String input (String index){
        System.out.print(index + "");
        String data = inputuser.nextLine();
        return data;
    }

}
