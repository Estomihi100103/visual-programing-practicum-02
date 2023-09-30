//12S23043 -Grace Tiodora
import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi, gedungElit, gedungStandart, gedungPerluPeningkatan, status;
        int kapasitasGudang, jumlahbuku, skor;

        System.out.println("Nama Gudang : ");
        namaGudang = input.nextLine();
        System.out.println("Kapasitas Gudang :");
        kapasitasGudang = input.nextInt();
        System.out.println("Jumlah Buku Saat Ini :");
        jumlahbuku = input.nextInt();
        System.out.println("AC :");
        aC = input.nextLine();
        System.out.println("Lantai :");
        lantai = input.nextLine();
        System.out.println("Ketersediaan Teknologi :");
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahbuku / kapasitasGudang * 100);
        if (skor >= 40) {
            status = "Gedung Elit";
            System.out.println("Gedung Ini Termasuk Gudang Elit");
        } else {
            if (skor >= 25) {
                status = "Gedung Standart";
                System.out.println("Gedung Ini Termasuk Gedung Standart");
            } else {
                if (skor < 25) {
                    status = "Gedung Perlu Peningkatan";
                    System.out.println("Gedung Ini Termasuk Gedung Perlu Peningkatan");
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahbuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + status);
    }
}
