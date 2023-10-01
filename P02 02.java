import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi, kualitasGudang;
        int kapasitasGudang, jumlahBuku, skor;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        String hasil1;

        skor = (int) ((double) jumlahBuku / kapasitasGudang * 100);
        if (skor >= 40) {
            hasil1 = "GudangElite";
        } else {
            if (skor >= 25) {
                hasil1 = "GudangStandar";
            } else {
                if (skor < 25) {
                    hasil1 = "GudangPerluPeningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + hasil1);
    }
}
