package com.tutorial;

public class tutorial14 {
    public static void main(String[] args) {
        //1. nilai integer ke long
        int nilaiint = 256;
        long nilailong = nilaiint;
        System.out.println("nilai integer " + nilaiint);
        System.out.println("nilai long " + nilailong);
        System.out.println("nilai max integer " + Integer.MAX_VALUE);

        // 2. nilai integer ke byte
        byte nilaibyte = (byte) nilaiint;
        System.out.println("nilai byte " + nilaibyte);
        System.out.println("nilai max byte "+ Byte.MAX_VALUE  );
        System.out.println("nilai min byte" + Byte.MIN_VALUE);


        // 3. Operator float
        float a = 20;
        int b = 3;

        float c = a/b;
        System.out.printf("%f / %d = %f\n",a,b,c);

    }
}
