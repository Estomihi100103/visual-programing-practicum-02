//12S23042 - Pretty Maria Purba
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi;
        int kapasitasGudang, jumlahBukuSaatIni, penggunaan;

        System.out.println("Masukkan Nama Gudang : ");
        namaGudang = input.nextLine();
        System.out.println("Masukkan Kapasitas Gudang : ");
        kapasitasGudang = input.nextInt();
        System.out.println("Masukkan Jumlah Buku Saat Ini :");
        jumlahBukuSaatIni = input.nextInt();
        System.out.println("Masukkan AC : ");
        aC = input.nextLine();
        System.out.println("Masukkan Jenis Lantai :");
        lantai = input.nextLine();
        System.out.println("Masukkan Ketersediaan Teknologi :");
        ketersediaanTeknologi = input.nextLine();
        int skor;

        System.out.println("Masukkan Skor :");
        skor = input.nextInt();
        String informasiGudang;

        penggunaan = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
        if (skor >= 40) {
            penggunaan = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
            informasiGudang = "Gudang Elite";
            System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + informasiGudang);
        } else {
            if (skor >= 25) {
                penggunaan = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
                informasiGudang = "Gudang Standar";
                System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + informasiGudang);
            } else {
                if (skor <= 25) {
                    penggunaan = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
                    informasiGudang = "Gudang Perlu Peningkatan";
                    System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + informasiGudang);
                } else {
                    informasiGudang = "Gudang Elite";
                    System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + informasiGudang);
                }
            }
        }
    }
} 
 