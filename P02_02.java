//12S23027 -Amos Raphael Manurung

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknolgi;
        int kapasitasgudang, jumlahbukusaatini, skor;

        namagudang = input.nextLine();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        skor = input.nextInt();
        skor = (int) ((double) jumlahbukusaatini / kapasitasgudang);
        if (skor >= 40) {
            kualitasgudang = gudangelit;
        } else {
            if (skor >= 25) {
                kualitasgudang = gudangstandar;
            } else {
                if (skor < 25) {
                    kualitasgudang = gudangperlupeningkatan;
                }
            }
        }
        System.out.println("informasi gudang");
        System.out.println(namagudang + "|" + aC + "|" + lantai + "|" + ketersediaanteknolgi + "|" + kapasitasgudang + "|" + jumlahbukusaatini + "|" + skor);
    }
}
