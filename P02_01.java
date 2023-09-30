// 12S23010 - Tiffani Rumiris Br Butar-Butar

import java.util.*;
import java.lang.Math;

public class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi, penilaian;
        int kapasitasGudang, jumlahBuku, skor;

        namaGudang = input.nextLine();
        kapasitasGudang = Integer.parseInt(input.nextLine());
        jumlahBuku = Integer.parseInt(input.nextLine());
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (double) jumlahBuku / kapasitasGudang * 100;
        if (skor >= 40) {
            penilaian = "Gudang Elite";
        } else {
            if (skor >= 25 && skor < 40) {
                penilaian = "Gudang Standar";
            } else {
                if (skor < 25) {
                    penilaian = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang: " + namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + penilaian);
    }
}

