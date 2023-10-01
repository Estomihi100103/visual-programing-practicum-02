// 12S23012 - Genesis Tombak Dapot Tua Panjaitan

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, ac, ketersediaan, teknologi, lantai, skor2;
        int kapasitas, jumlah, skor;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor >= 40) {
            skor2 = "Gudang Elite";
        } else {
            if (skor <= 40 && skor >= 25) {
                skor2 = "Gudang Standar";
            } else {
                if (skor < 25) {
                    skor2 = "Gudang Perlu Peningkatan";
                } else {
                    skor2 = " ";
                }
            }
        }
        System.out.println("Informasi Gudang : " + nama + "|" + kapasitas + "|" + jumlah + "|" + ac + "|" + lantai + "|" + ketersediaan + "|" + skor + "|" + skor2);
    }
}
