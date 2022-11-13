package com.tutorial;

public class Array {
    public static void main(String[] args) {
        String [] mobil = {"Honda Jazz", "Xenia", "Honda Brio"};
        String [] motor = {"Vario", "Supra Bapak ", "PCX", "HOnda Beat", "R15", "Cbr-150" };
        String [] makanan = {"Nasi lengko", "Nasi Padang", "Gudeg", "Rendang", "Bakso"};
        String [] minuman = {"Es Boba", "Milo", "Teh Manis", "Es Jeruk"};

        System.out.println("Saya punya kendaraan " + mobil[2] + " dan " + motor [1]);
        System.out.println("Waktu Pagi" +" Saya sedang makan " + makanan[3]  + " dengan minuman " + minuman[1]) ;
        System.out.println("Dan Siang Ini Saya sedang makan " + makanan[4] + " dengan minumannya " + minuman[3]  );
    }
}
