package com.latihan;

public class operatorunary {
    public static void main(String[] args) {
        int angka = 3;
        System.out.printf("unary %d menjadi menjadi %d\n", angka, +angka);
        System.out.printf("unary %d menjadi %d\n", angka, -angka);

        int angka1= 10;
        angka1++;
        System.out.println(angka1);

        angka++;
        System.out.println(angka);

        angka1++;
        angka1++;
        System.out.println(angka1);
        int angka2= 100;
        angka2--;
        angka2--;
        System.out.println("nilai angka 100 sekarang adalah " + angka2);

        System.out.printf("nilai dengan '++' prefix menjadi = %d\n ", ++angka2);
        System.out.printf("nilai dengan '++' postfix  sebelum dieksekusi menjadi = %d\n ", angka2++);
        System.out.printf("nilai setelah dieksekusi sekarang adalah  = %d\n", angka2);

        double angka4 = 4.5;
        System.out.println("nilai angka ini adalah " + angka4);

        double angka5= angka2 + angka4;
        System.out.printf("hasil dari perjumlahan %d +%f = %f\n",angka2,angka4,angka5);

        if (angka5 > angka2){
            System.out.println("Good morning");
        } else {
            System.out.println("Good Evening");
        }


       int angka6 = 200;
        angka6++;
        angka6++;
        System.out.printf("Nilai angka 6 = %d \n",angka6);
        System.out.printf("Nilai angka 6 = %d \n",-angka6);
    }

}
