// 12S23026_Arif M. Doloksaribu
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, kualitasgudang;
        int kapasitasgudang, jumlahbukusaatini, poinGudang;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        poinGudang = (int) ((double) jumlahbukusaatini / kapasitasgudang * 100);
        if (poinGudang >= 40) {
            kualitasgudang = "Gudang Elite";
        } else {
            if (poinGudang >= 25 && poinGudang < 40) {
                kualitasgudang = "Gudang Standar";
            } else {
                if (poinGudang < 25) {
                    kualitasgudang = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang : ");
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbukusaatini + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + poinGudang + "|" + kualitasgudang);
    }
}
