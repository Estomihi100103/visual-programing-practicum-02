import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, ac, lantai, ketersediaanteknologi, kualitasgudang;
        int kapasitasgudang, jumlahbuku, skorgudang;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbuku = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        kualitasgudang = input.nextLine();
        skorgudang = input.nextInt();
        skorgudang = (int) ((double) jumlahbuku / kapasitasgudang * 100);
        if (skorgudang >= 40) {
            kualitasgudang = "gudang elit";
        } else {
            if (skorgudang > 40) {
                kualitasgudang = "gudang perlu peningkatan";
            }
            if (skorgudang >= 25) {
                kualitasgudang = "gudang standart";
            } else {
                if (skorgudang > 25) {
                    kualitasgudang = "gudang perlu peningkatan";
                }
            }
        }
        System.out.println("informasi gudang");
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbuku + "|" + ac + "|" + lantai + "|" + ketersediaanteknologi + "|" + skorgudang + "|" + kualitasgudang);
    }
}
