package com.tutorial;

public class tutorial13 {
    static void cekUsia(int usia){
        if (usia > 20 ){
            System.out.println("Anda memasuki dewasa");

        }else {
            System.out.println("Anda Belum cukup umur");
        }
    }

    public static void main(String[] args) {
        cekUsia(21);
    }

}
