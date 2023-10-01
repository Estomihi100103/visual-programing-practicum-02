//12S23027 -Amos Raphael Manurung

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, kualitasgudang;
        int kapasitasgudang, jumlahbukusaatini, skor;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbukusaatini / kapasitasgudang * 100);
        if (skor >= 40) {
            kualitasgudang = "GudangElite";
        } else {
            if (skor >= 25) {
                kualitasgudang = "GudangStandar";
            } else {
                if (skor < 25) {
                    kualitasgudang = "GudangPerluPeningkatan";
                }
            }
        }
        System.out.println("informasi gudang");
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbukusaatini + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + kualitasgudang);
    }
}
