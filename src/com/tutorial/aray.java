package com.tutorial;

public class aray {
    public static void main(String[] args) {
        int [] number = new int[4];

        //memasukkan value ke dalam array

        number[0] = 6;
        number[3] = 67;

        System.out.println("panjang array number adalah " + number.length);
        double [] angkasaya = {3,4,2,0,5,10,9,8};

        String [] mobil = {"Avanza", "Mobilio", "Xenia", "Honda Jazz"};
        String [] motor = {"Supra", "Vario", "PCX" , "N-Max"};
        System.out.println("panjang array angka saya adalah " + angkasaya.length);
        System.out.println("angka ke " + angkasaya[4]);
        System.out.println("Saya punya mobil " + mobil[3]);
        System.out.println("Saya punya motor " + motor[3]);



    }
}
