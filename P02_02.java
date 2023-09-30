//12S23006-Cardolan sinaga
import java.util.*;
import java.lang.Math;

class P02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, kapasitas1;
        int jumlah, kapasitas;
        String informasigudang;

        namagudang = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        kapasitas = (int) ((double) jumlah / kapasitas * 100);
        if (kapasitas > 40) {
            kapasitas1 = "gudang elite";
        } else {
            if (kapasitas < 40 && kapasitas > 25) {
                kapasitas1 = "gudang standar";
            } else {
                if (kapasitas < 25) {
                    kapasitas1 = "gudang aneh";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitas + "|" + jumlah + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + kapasitas1);
    }
}
