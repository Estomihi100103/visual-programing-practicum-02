//12S23046 -Anastasya Tabita Blessing Siahaan

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, lantai, ac, ketersediaanteknologi, jenisgudang;
        int kapasitasgudang, jumlahbukutersedia, skor;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukutersedia = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbukutersedia / kapasitasgudang * 100);
        if (skor >= 40) {
            jenisgudang = "gudang elite";
        } else {
            if (skor >= 25) {
                jenisgudang = "gudang standar";
            } else {
                if (skor < 25) {
                    jenisgudang = "gudang perlu peningkatan";
                }
            }
        }
        System.out.println("informasi gudang:");
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbukutersedia + "|" + ac + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + jenisgudang);
    }
}

