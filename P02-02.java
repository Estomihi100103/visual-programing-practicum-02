import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String selamatDatangdiTokoSepAn;
        String namaGudang, aC, lantai, ketersediaanTeknologi;
        int jumlahBukusaatini, kapasitasGudang;
        double skor;
        String gudangElite, hasil1, hasil2, hasil3;

        System.out.println("HAI Selamat Datang di Toko SepAn");
        System.out.println("Masukkan Nama Gudang");
        namaGudang = input.nextLine();
        System.out.println("Masukkan Kapasitas Gudang");
        kapasitasGudang = input.nextInt();
        System.out.println("Masukkan AC");
        aC = input.nextLine();
        System.out.println("Masukkan Lantai");
        lantai = input.nextLine();
        System.out.println("Ketersediaan Teknologi");
        ketersediaanTeknologi = input.nextLine();
        System.out.println("Jumlah Buku Saat Ini");
        jumlahBukusaatini = input.nextInt();
        System.out.println("Skor");
        skor = input.nextDouble();
        System.out.println("Nama Gudang : " + namaGudang);
        System.out.println("Kapasitas Gudang : " + kapasitasGudang);
        System.out.println("AC : " + aC);
        System.out.println("Lantai : " + lantai);
        System.out.println("Ketersediaan Teknologi : " + ketersediaanTeknologi);
        System.out.println("Jumlah Buku Saat Ini : " + jumlahBukusaatini);
        if (skor >= 40) {
            hasil1 = "Gudang Elite";
        } else {
            if (skor >= 25) {
                hasil1 = "Gudang Standar";
            } else {
                if (skor < 25) {
                    hasil1 = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukusaatini + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi);
        System.out.println("Terima Kasih");
    }
}
