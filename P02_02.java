// 12S23045 - Chintya Reginauli Rajagukguk
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, kapasitas1, informasigudang;
        int jumlah, kapasitas;

        namagudang = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        kapasitas = (int) ((double) kapasitas / jumlah * 100);
        if (kapasitas > 40) {
            kapasitas1 = "gudang elite";
        } else {
            if (kapasitas < 40 && kapasitas > 25) {
                kapasitas1 = "gudang standar";
            } else {
                if (kapasitas < 25) {
                    kapasitas1 = "gudang perlu peningkatan";
                } else {
                    kapasitas1 = "kapasitas tidak memenuhi";
                }
            }
        }
        System.out.print(namagudang + " | " + kapasitas + " | " + jumlah + " | " + aC + " | " + lantai + " | " + ketersediaanteknologi + " | " + kapasitas1);
    }
}
