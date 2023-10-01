//12S23038 -Alya Triswani

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, ac, lantai, teknologi, gudang;
        int kapasitas, jumlah, skor, x;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        teknologi = input.nextLine();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor >= 40) {
            gudang = "gudang elit";
        } else {
            if (skor < 40 && skor >= 25) {
                gudang = "gudang standar";
            } else {
                if (skor < 25) {
                    gudang = "gudang perlu peningkatan";
                }
            }
        }
        System.out.println(gudang + "|" + kapasitas + "|" + jumlah + "|" + ac + "|" + lantai + "|" + teknologi + "|" + skor + "|" + gudang);
    }
}
