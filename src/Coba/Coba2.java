package Coba;

import java.util.Scanner;

public class Coba2 extends Coba1 {
    Scanner input = new Scanner(System.in);
    public int Pilih (int pilihan){
        this.pilihan = pilihan;
        System.out.println("");
        System.out.println("|Selamat Datang di Hotel Amaris Malang");
        System.out.println("|Kami Menawarkan Paket Menginap dengan Kategori Sebagai Berikut : ");
        System.out.println("");
        System.out.println("|=========================================|");
        System.out.println("| 1. Kamar Reguler   : Rp 230.000 / malam |");
        System.out.println("| 2. Kamar Executive : Rp 300.000 / malam |");
        System.out.println("| 3. Kamar Suites    : Rp 525.000 / malam |");
        System.out.println("| Pembelian >= 350K Diskon 20% maks 200K  |");
        System.out.println("|-----------------------------------------|");
        System.out.println("");
        return pilihan;
    }
    public void setPilihan(){
        System.out.print("|Silakan Masukkan Tipe Kamar Pilihan Anda : ");
        pilihan = input.nextInt();
    }
    public void OutputPilihan1(int kamar){
        this.kamar = kamar;
        if (pilihan == 1){
            System.out.println("");
            System.out.println("|Anda Memilih Kamar Reguler dengan Tarif Rp 230.000 / malam");
            total = kamar*230000;
            diskon = total*0.20;
            receipt = total-diskon;
            if (total >= 350000 && diskon <= 200000){
                System.out.println("");
                System.out.println("|Anda Memesan " + kamar + " Kamar Tipe Reguler");
                System.out.println("|Anda Mendapat Diskon Sebesar 20% maks. Rp 200.000");
                System.out.println("|Total Tagihan : (" + kamar + " x Rp 230.000) - " + diskon);
                System.out.println("               : " + total + " - " + diskon);
                System.out.println("               : " + receipt);
            }else{
                System.out.println("|Anda Memesan " + kamar + " Kamar Tipe Reguler");
                System.out.println("|Total Tagihan : " + kamar + " x Rp 230.000");
                System.out.println("               : " + total);
                System.out.println("|Catatan       : Anda Tidak Dapat Mengaktifkan Diskon Karena Nominal Pemesanan");
                System.out.println("                 Kurang atau Lebih Dari Persyaratan Tarif Minimum dan Batas Atas");
                System.out.println("                 Nominal Diskon yang Dapat Diberikan");
            }
        }
    }
    public void OutputPilihan2(int kamar){
        this.kamar = kamar;
        if (pilihan == 2){
            System.out.println("");
            System.out.println("|Anda Memilih Kamar Executive dengan Tarif Rp 300.000 / malam");
            total = kamar*300000;
            diskon = total*0.20;
            receipt = total-diskon;
            if (total >= 350000 && diskon <= 200000){
                System.out.println("");
                System.out.println("|Anda Memesan " + kamar + " Kamar Tipe Executive");
                System.out.println("|Anda Mendapat Diskon Sebesar 20% maks. Rp 200.000");
                System.out.println("|Total Tagihan : (" + kamar + " x Rp 300.000) - " + diskon);
                System.out.println("               : " + total + " - " + diskon);
                System.out.println("               : " + receipt);
            }else{
                System.out.println("|Anda Memesan " + kamar + " Kamar Tipe Executive");
                System.out.println("|Total Tagihan : " + kamar + " x Rp 300.000");
                System.out.println("               : " + total);
                System.out.println("|Catatan       : Anda Tidak Dapat Mengaktifkan Diskon Karena Nominal Pemesanan");
                System.out.println("                 Kurang atau Lebih Dari Persyaratan Tarif Minimum dan Batas Atas");
                System.out.println("                 Nominal Diskon yang Dapat Diberikan");
            }
        }
    }
    public void OutputPilihan3(int kamar){
        this.kamar = kamar;
        if (pilihan == 3){
            System.out.println("");
            System.out.println("|Anda Memilih Kamar Suites dengan Tarif Rp 525.000 / malam");
            total = kamar*525000;
            diskon = total*0.20;
            receipt = total-diskon;
            if (total >= 350000 && diskon <= 200000){
                System.out.println("");
                System.out.println("|Anda Memesan " + kamar + " Kamar Tipe Suites");
                System.out.println("|Anda Mendapat Diskon Sebesar 20% maks. Rp 200.000");
                System.out.println("|Total Tagihan : (" + kamar + " x Rp 525.000) - " + diskon);
                System.out.println("               : " + total + " - " + diskon);
                System.out.println("               : " + receipt);
            }else{
                System.out.println("|Anda Memesan " + kamar + " Kamar Tipe Suites");
                System.out.println("|Total Tagihan : " + kamar + " x Rp 525.000");
                System.out.println("               : " + total);
                System.out.println("|Catatan       : Anda Tidak Dapat Mengaktifkan Diskon Karena Telah Melebihi Nominal Diskon yang Diberikan");
            }
        }
    }
    public int SetKamar(){
        System.out.print("|Ingin Pesan Berapa Kamar? : ");
        kamar = input.nextInt();
        return kamar;
    }
}
