//12S23023 - Lenni febriyani

import java.util.*;
import java.lang.Math;

class Program P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang;

        System.out.println("Masukkan Nama Gudang");
        namaGudang = input.nextLine();
        int kapasitasGudang;

        System.out.println("Masukkan Kapasitas Gudang");
        kapasitasGudang = input.nextInt();
        int jumlahBukuSaatIni;

        System.out.println("Masukkan Jumlah Buku Saat Ini");
        jumlahBukuSaatIni = input.nextInt();
        String aC;

        System.out.println("AC?");
        aC = input.nextLine();
        String lantai;

        System.out.println("Masukkan Jenis Lantai");
        lantai = input.nextLine();
        String ketersediaanTeknologi;

        System.out.println("Bagaimana Ketersediaan Teknologi?");
        ketersediaanTeknologi = input.nextLine();
        int skor;

        System.out.println("Masukkan skor");
        skor = input.nextInt();
        String hasil1;

        if (skor >= 40) {
            hasil1 = "Gudang Elite";
        } else {
            if (skor >= 25) {
                hasil1 = "Gudang Standar";
            } else {
                if (skor < 25) {
                    hasil1 = "Gudang perlu peningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + hasil1);
    }
}
