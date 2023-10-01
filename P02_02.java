//12S23047 -Jennifer Hopenes Sihotang

import java.util.*;
import java.lang.Math;

class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang, aC, lantai, ketersediaanTeknologi, status;
        int kapasitasGudang, jumlahBuku, kapasitas, skor;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        skor = (int) ((double) jumlahBuku / kapasitasGudang * 100);
        if (skor >= 40) {
            status = "GudangElite";
        } else {
            if (skor >= 25) {
                status = "GudangStandar";
            } else {
                if (skor < 25) {
                    status = "GudangPerluPeningkatan";
                }
            }
        }
        System.out.println(namaGudang + "|" + kapasitasGudang + "|" + jumlahBuku + "|" + aC + "|" + lantai + "|" + ketersediaanTeknologi + "|" + skor + "|" + status);
    }
}
