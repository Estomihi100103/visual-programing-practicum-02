import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang;
        int kapasitasGudang;
        int jumlahBukuSaatIni;
        String aC;
        String lantai;
        String ketersediaanTeknologi;
        int skor;
        String hasil;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBukuSaatIni = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahBukuSaatIni / kapasitasGudang * 100);
        if (skor >= 40) {
            hasil = "GudangElite";
        } else {
            if (skor >= 25) {
                hasil = "GudangStandar";
            } else {
                if (skor < 25) {
                    hasil = "GudangPerluPeningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBukuSaatIni + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + hasil);
    }
}
