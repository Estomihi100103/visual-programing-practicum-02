import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int skor;
        String status;
        String namaGudang;
        int kapasitasGudang;
        int jumlahBuku;
        String aC;
        String lantai;
        String ketersediaanTeknologi;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahBuku / kapasitasGudang * 100);
        if (skor >= 40) {
            status = "Gudang Elite";
            System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + status);
        } else {
            if (skor >= 25) {
                status = "Gudang Standar";
                System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + status);
            } else {
                if (skor < 25) {
                    status = "Gudang perlu peningkatan";
                    System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + status);
                }
            }
        }
    }
}
