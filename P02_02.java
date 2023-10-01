//12S23013 -Andika Immanuel Nadapdap
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, aC, lantai, ketersediaan, skor2;
        int kapasitas, jumlah, skor;
        double penggunaankapasitas;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlah = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = (int) ((double) jumlah / kapasitas * 100);
        if (skor > 40) {
            skor2 = "Gudang Elite";
        } else {
            if (skor >= 25 && skor < 40) {
                skor2 = "Gudang Standar";
            } else {
                if (skor < 25) {
                    skor2 = "Gudang Perlu Peningkatan";
                } else {
                    skor2 = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println(nama + "|" + kapasitas + "|" + jumlah + "|" + aC + "|" + lantai + "|" + ketersediaan + "|" + skor + "|" + skor2);
    }
}
