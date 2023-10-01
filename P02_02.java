// 12S23001 - Kevin Gultom

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi, rekom;
        int kapasitasGudang, jumlahBuku, skor;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahBuku / kapasitasGudang * 100);
        if (skor >= 40) {
            rekom = "Gudang Elite";
        } else {
            if (skor >= 25) {
                rekom = "Gudang Standart";
            } else {
                rekom = "Gedung Perlu Peningkatan";
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + rekom);
    }
}
