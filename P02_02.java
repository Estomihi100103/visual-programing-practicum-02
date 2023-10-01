// 12S23028 - Daniel Situmorang
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaan, kualitas;
        double kapasitas, jumlah, skor;

        namagudang = input.nextLine();
        kapasitas = input.nextDouble();
        jumlah = input.nextDouble();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = jumlah / kapasitas * 100;
        if (skor >= 40) {
            kualitas = "Gudang Elite";
        } else {
            if (skor >= 25) {
                kualitas = "Gudang Standar";
            } else {
                if (skor < 25) {
                    kualitas = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitas + "|" + jumlah + "|" + aC + "|" + lantai + "|" + ketersediaan + "|" + skor + "|" + kualitas);
    }
}
