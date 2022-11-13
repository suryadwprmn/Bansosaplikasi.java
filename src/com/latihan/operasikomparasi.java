package com.latihan;

public class operasikomparasi {
    public static void main(String[] args) {
        int a;
        int b;
        boolean hasilkomparasi;

        a = 11;
        b= 10;
        hasilkomparasi = (a == b);
        System.out.printf("(%d == %d)? %s\n",a,b,hasilkomparasi);

        a = 11;
        b= 10;
        hasilkomparasi = (a < b);
        System.out.printf("(%d < %d)? %s\n",a,b,hasilkomparasi);

        a = 11;
        b= 10;
        hasilkomparasi = (a > b);
        System.out.printf("(%d > %d)? %s\n",a,b,hasilkomparasi);

        a = 11;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("(%d!= %d)? %s\n",a,b,hasilkomparasi);





    }

}
