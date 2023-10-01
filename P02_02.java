//12S23004_Poppy Sibuea

import java.util.*;
import java.lang.Math;

class P02_02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, s;
        int kapasitas, x;
        int jumlah;
        String aC;
        String lantai;
        String ketersediaanTeknologi;

        namaGudang = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        x = (int) ((double) jumlah / kapasitas * 100);
        if (x >= 40) {
            s = "Gudang Elite";
        } else {
            if (x < 40 && x >= 25) {
                s = "Gudang Standar";
            } else {
                if (x < 25) {
                    s = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang: ");
        System.out.println(namaGudang + "|" + kapasitas + "|" + jumlah + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + x + "|" + "|" + s);
    }
}
