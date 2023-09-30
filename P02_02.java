// 12S23037 - Oracle Tio Panjaitan

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, lantai, ketersediaan, aC, rekomendasi;
        int kapasitas, jumlah, skor;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor >= 40) {
            rekomendasi = "Gudang Perlu Peningkatan";
        } else {
            if (skor >= 25) {
                rekomendasi = "Gudang Standar";
            } else {
                rekomendasi = "Gudang perlu peningkatan";
            }
        }
        System.out.print("Informasi Gudang : " + nama + " | " + kapasitas + " | " + jumlah + " | " + aC + " | " + lantai + " | " + ketersediaan + " | " + skor + " | " + rekomendasi);
    }
}
