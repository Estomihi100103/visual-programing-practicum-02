//12S23032 -Seprian Siagian
import java.util.*;
import java.lang.Math;

class Program P02_02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, ac, lantai, ketersediaan, kategori;
        int kapasitas, jumlahbuku;
        int skor;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlahbuku = input.nextInt();
        ac = input.nextLine();
        lantai = input.nextLine();
        ketersediaan = input.nextLine();
        skor = input.nextInt();
        kapasitas = (int) ((double) jumlahbuku / kapasitas * 100);
        if (skor >= 40) {
            kategori = "Gudang Elite";
        } else {
            if (skor >= 25) {
                kategori = "Gudang Standar";
            } else {
                if (skor < 25) {
                    kategori = "Perlu Peningkatan";
                } else {
                    kategori = "";
                }
            }
        }
        System.out.println(Integer.toString(kapasitas) + "|" + nama + "|" + kapasitas + "|" + jumlahbuku + "|" + ac + "|" + lantai + "|" + ketersediaan + "|" + kategori);
    }
}
