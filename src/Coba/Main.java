package Coba;

public class Main {
    public static void main(String[] args) {
        PilihHotel Choose = new PilihHotel();
        Coba1 dicoba = new Coba1();
        Coba2 diresapi = new Coba2();

        Choose.PilihHotel(Choose.pilihan);
        Choose.setPilihan();
        if (Choose.pilihan == 1){
            dicoba.Pilihehe(dicoba.pilihan);
            dicoba.setPilihan();
            if (dicoba.pilihan == 1){
                dicoba.SetKamar();
                dicoba.OutputPilihan1(dicoba.kamar);
            }else if (dicoba.pilihan == 2){
                dicoba.SetKamar();
                dicoba.OutputPilihan2(dicoba.kamar);
            }else if (dicoba.pilihan == 3){
                dicoba.SetKamar();
                dicoba.OutputPilihan3(dicoba.kamar);
            }
        }else if (Choose.pilihan == 2){
            diresapi.Pilihehe(diresapi.pilihan);
            diresapi.setPilihan();
            if (diresapi.pilihan == 1){
                diresapi.SetKamar();
                diresapi.OutputPilihan1(diresapi.kamar);
            }else if (diresapi.pilihan == 2){
                diresapi.SetKamar();
                diresapi.OutputPilihan2(diresapi.kamar);
            }else if (diresapi.pilihan == 3){
                diresapi.SetKamar();
                diresapi.OutputPilihan3(diresapi.kamar);
            }
        }

    }
}
