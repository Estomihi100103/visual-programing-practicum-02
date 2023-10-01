// 12S23011 - Mabel Christoffel A.S 

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, ac, lantai, ketersediaan, status;
        int kapasitas, jumlah, poin, terpakai;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        poin = (int) ((double) jumlah / kapasitas * 100);
        if (poin >= 40) {
            status = "Gudang Elite";
        } else {
            if (poin < 40 && poin >= 25) {
                status = "Gudang Standar";
            } else {
                if (poin < 25) {
                    status = "Gedung Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang: ");
        System.out.println(nama + "|" + kapasitas + "|" + jumlah + "|" + ac + "|" + lantai + "|" + ketersediaan + "|" + poin + "|" + status);
    }
}
