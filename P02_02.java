// 12S23031-Matthew Pangihutan
import java.util.*;
import java.lang.Math;

public class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, kapasitasGudang, jumlahBukuSaatIni, aC, lantai, ketersediaanTeknologi;
        
        System.out.println("NamaGudang");
        namaGudang = input.nextLine();
        System.out.println("KapasitasGudang");
        kapasitasGudang = input.nextLine();
        System.out.println("JumlahBukuSaatIni");
        jumlahBukuSaatIni = input.nextLine();
        System.out.println("AC");
        aC = input.nextLine();
        System.out.println("Lantai");
        lantai = input.nextLine();
        System.out.println("KetersediaanTeknologi");
        ketersediaanTeknologi = input.nextLine();
        if (SkorGudang >= 40) {
            Hasil = "Gudang Elite";
        } else {
            if (SkorGudang >= 25) {
                Hasil = "Gudang Standar";
            } else {
                if (SkorGudang >= 25) {
                    Hasil = "Gudang Perlu Peringkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi);
    }
}

