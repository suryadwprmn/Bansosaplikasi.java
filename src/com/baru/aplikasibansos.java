package com.baru;

import java.util.Random;
import java.util.Scanner;

public class aplikasibansos {



        public static int penerimabantuan = 100; // Penerima bantuan 100 orang
        public static String[] minyakgoreng = new String[20]; // Penerima minyak goreng ada 20
        public static String[] gula = new String[30]; // Penerima gula ada 30
        public static String[] miegoreng = new String[35]; // Penerima mie goreng ada 35
        public static String[] tehhijau = new String[15]; // Penerima teh hijau ada 15

        public static Scanner inputuser = new Scanner(System.in);

        public static String output (String index){
            //outputan akan keluar jika sudah mengisi nama pendaftar,umur, dan alamat
        System.out.print(index + " : ");
        return inputuser.nextLine();

    }

//        public static void tesInput () {
//        String input = output("Masukkan Nama");
//        System.out.println("Nama anda Adalah " + input);
//    }
        public static void pendaftarbansos () {
            while (true) {
                System.out.println(" ======== Aplikasi Penerima Bansos ========= ");
                System.out.println(" ******************************************* ");
                System.out.println();

                String namapendaftar = output("Masukkan Nama Anda");
                String umur = output("Umur Anda");
                String alamat = output("Masukkan Alamat");
                if (namapendaftar.isBlank() || umur.isBlank() || alamat.isBlank()){
                    System.out.println(" Lengkapi Identitas Anda!!!!! ");
                    System.out.println();
                    pendaftarbansos();

                }
                else {
                    System.out.println();
                    System.out.println("Nama anda Adalah " + namapendaftar);
                    System.out.println("Umur anda adalah " + umur);
                    System.out.println("Alamat Anda " +alamat);

                    Random randomnumber = new Random();
                    int switchStatement = randomnumber.nextInt(4);
                    tampilanDatabansos(switchStatement,namapendaftar);


                }
                System.out.println();
            }


    }
    public static void tampilanDatabansos(int number, String namapendaftar){
            switch (number){
                case 1 ->

                {
                    inputdatakeArray(minyakgoreng,namapendaftar);
                    System.out.println("Selamat Anda mendapat Minyak Goreng");
                    tampilkansemuadatabansos();
                }
                case 2 ->


                {
                    inputdatakeArray(gula,namapendaftar);
                    System.out.println("Selamat Anda mendapatkan Gula");
                    tampilkansemuadatabansos();

                }
                case 3 ->


                {
                    inputdatakeArray(miegoreng,namapendaftar);
                    System.out.println("Selamat anda mendapatkan Mie Goreng ");
                    tampilkansemuadatabansos();

                }
                case 4 ->

                {
                    inputdatakeArray(tehhijau,namapendaftar);
                    System.out.println("Selamat anda mendapatkan Teh Hijau");
                    tampilkansemuadatabansos();
                }
            }
    }
    public static void inputdatakeArray(String [] namaArray , String indexnama){
            for (int i =0; i< namaArray.length;i++){
                namaArray [i]= indexnama;
                break;

            }
    }
    public static void tampilkansemuadatabansos(){
            int sisaKuotabansos = 0;
                int minyakGorengdata = 0;
                for (int i = 0 ; i < minyakgoreng.length ; i++){
                    if (minyakgoreng [i] != null){
                        minyakGorengdata++;
                    }
                }
                int mieGorengdata = 0;
                for (int i = 0 ; i < miegoreng.length;i++){
                    if ( miegoreng[i] != null){
                        mieGorengdata++;
                    }

                }
                int gulaPasirdata = 0;
                for (int i = 0; i <gula.length;i++){
                    if (gula[i] != null){
                        gulaPasirdata++;
                    }
                }
                int tehHijaudata = 0;
                for (int i= 0 ; i < tehhijau.length; i++){
                    if (tehhijau[i] != null) {
                        tehHijaudata++;
                    }
                }
                // Mengeksekusi Semua Data dan mengurangi data penerima
                sisaKuotabansos = penerimabantuan - mieGorengdata - gulaPasirdata - minyakGorengdata - tehHijaudata;
        System.out.println("\n Sisa kuota Minyak Goreng adalah " + minyakGorengdata);
        System.out.println("Sisa kuota Gula Pasir adalah" + gulaPasirdata);
        System.out.println("Sisa Kuota Mie Goreng adalah" + mieGorengdata);
        System.out.println("Sisa Kuota Teh HIjau adalah " +tehHijaudata );
        System.out.println("Total Penerima Kuota adalah " + penerimabantuan + "dan Sisa kuota " +sisaKuotabansos);

    }



        public static void main (String[]args){
        pendaftarbansos();

    }



}

