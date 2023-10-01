//12S23008-Ranty Insen Pakpahan
import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, ac, lantai, ketersediaanteknologi, tipe;
        int kapasitasgudang, jumlahbukusaatini;
        int skor;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbukusaatini / kapasitasgudang * 100);
        if (skor >= 40) {
            tipe = "gudang elite";
        } else {
            if (skor >= 25) {
                tipe = "gudang standar";
            } else {
                if (skor < 25) {
                    tipe = "gudang perlu peningkatan";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbukusaatini + "|" + ac + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + tipe);
    }
}
