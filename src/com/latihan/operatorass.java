package com.latihan;

public class operatorass {
    public static void main(String[] args) {
        //penjumlahan
        int a = 100;
        a+= 50;
        System.out.println("nilai dari a " + a);

        //pengurangan
        int b = 1000;
        b-= 298;
        System.out.println("nilai dari b " + b);

        //perkalian
        int c = 11;
        c*= 20;
        System.out.println("nilai dari c " + c);

        //pembagian
        int d = 1000;
        d/= 50;
        System.out.println("nilai dari d " + d);

        //modulus (sisa bagi)
        int e = 100;
        e%= 98;
        System.out.println("nilai dari e " + e);


        int z = a + e;

        System.out.printf("hasil %d + %d =%d\n",a,e,z );
        z+= 200;
        System.out.println("z + 200 = " +z);

    }
}
