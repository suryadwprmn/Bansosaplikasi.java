package com.tutorial;

public class tutorial9 {
    public static void main(String[] args) {
        int nilaiawal = 1;
        int nilaiakhir = 10;
        int nilaitengah = 5;
        for (nilaiawal = 1;nilaiawal <= nilaiakhir ; nilaiawal++){
            if ( nilaiawal < 7 ){
                System.out.println("Angkot no" + nilaiawal + " sedang beroperasi");
            } else if (nilaitengah == 5 ){
                System.out.println("Angkot no" + nilaitengah + "sedang diperbaiki");
            } else {
                System.out.println("angkot no" + nilaiawal +"sedang beroperasi");
            }

        }
    }
}
