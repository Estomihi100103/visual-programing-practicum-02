//12S23019 CLARASIA L. SIMANJUNTAK

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang;
        int kapasitasgudang;
        int jumlahbukusaatini;
        String aC;
        String lantai;
        String ketersediaanteknologi;
        int skor;
        String hasil;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = input.nextInt();
        if (skor >= 40) {
            hasil = "gudang elite";
        } else {
            if (skor >= 25) {
                hasil = "gudang standar";
            } else {
                if (skor < 25) {
                    hasil = "gudang perlu peningkatan";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbukusaatini + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + hasil);
    }
}
