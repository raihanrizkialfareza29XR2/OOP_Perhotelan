package Coba;

public class PilihHotel extends Coba1 {
    public int PilihHotel(int pilihan){
        this.pilihan = pilihan;
        System.out.println("");
        System.out.println("|=========================================|");
        System.out.println("|   Selamat Datang di Program Traveloki   |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|  Silakan Pilih Diantara 2 Hotel Berikut |");
        System.out.println("|          1. Hotel Ibis Malang           |");
        System.out.println("|          2. Hotel Amaris Malang         |");
        System.out.println("|=========================================|");
        return pilihan;
    }
    public void setPilihan(){
        System.out.println("");
        System.out.print("|Silakan Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
    }
}
