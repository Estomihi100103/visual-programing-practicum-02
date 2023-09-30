//12S23005 - Ariella U.C Sihombing
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String informasiGudang;
        String namaGudang;
        int kapasitasGudang;
        int jumlahBuku;
        String aC;
        String lantai;
        String ketersediaanTeknologi;
        int skor;
        String penilaian;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahBuku / kapasitasGudang * 100);
        if (skor >= 40) {
            penilaian = "Gudang Elite";
        } else {
            if (skor >= 25) {
                penilaian = "Gudang Standar";
            } else {
                if (skor < 25) {
                    penilaian = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + penilaian);
    }
}
