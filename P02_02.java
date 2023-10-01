//12S23002 - Fernando Alexander Silitonga
import java.util.*;
import java.lang.Math;

class 02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, lantai, sedia, s;
        String ac;
        int kapasitas, jumlah, x;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        sedia = input.nextLine();
        x = (int) ((double) jumlah / kapasitas * 100);
        if (x >= 40) {
            s = "Gudang elite";
        } else {
            if (x < 40 && x >= 25) {
                s = "Gudang standar";
            } else {
                if (x < 25) {
                    s = "Gudang perlu peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang: ");
        System.out.println(nama + "|" + kapasitas + "|" + jumlah + "|" + ac + "|" + lantai + "|" + sedia + "|" + x + "|" + s);
    }
}
