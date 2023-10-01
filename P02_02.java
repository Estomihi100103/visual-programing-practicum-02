// 12S23050 -Yolanda Septania Saragih

import java.util.*;
import java.lang.Math;

class  P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi;
        int kapasitas, jumlahbukusaatini, skor, kualitas;

        namagudang = input.nextLine();
        kapasitas = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbukusaatini / kapasitas * 100);
        if (skor >= 40) {
            kualitas = "gudang elite";
        } else {
            if (skor >= 25) {
                kualitas = "gudang standar";
            } else {
                if (skor >= 20) {
                    kualitas = "gudang perlu peningkatan";
                }
            }
        }
        System.out.println("informasi gudang");
        System.out.println(namagudang + "|" + kapasitas + "|" + jumlahbukusaatini + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi);
    }
}
