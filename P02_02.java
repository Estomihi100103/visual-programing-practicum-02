// 12S23021 - Eunike Purba

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, ac, lantai, ketersediaanteknologi, kualitasgudang, nilai;
        int kapasitas, jumlahbuku, skor;

        nama = input.nextLine();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        kualitasgudang = input.nextLine();
        kapasitas = input.nextInt();
        jumlahbuku = input.nextInt();
        skor = (int) ((double) jumlahbuku / kapasitas * 100);
        if (skor >= 40) {
            nilai = "gudang elit";
        } else {
            if (skor >= 25 && nilai <= 40) {
                nilai = "gudangstandar";
            } else {
                if (skor <= 25) {
                    nilai = "gudang perlu peningkatan";
                } else {
                    nilai = "gudangperlupeningkatan";
                }
            }
        }
        System.out.println(nama + "|" + kapasitas + "|" + jumlahbuku + "|" + ac + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + nilai);
    }
}
