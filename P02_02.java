//12S23051 -Theresia Silaban
import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, status;
        int kapasitasgudang, jumlahbuku, kapasitas, skor;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbuku = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skor = (int) ((double) jumlahbuku / kapasitasgudang * 100);
        if (skor >= 40) {
            status = "gudangelite";
        } else {
            if (skor >= 25) {
                status = "gudangstandar";
            } else {
                if (skor < 25) {
                    status = "gudangperlupeningkatan";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbuku + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + skor + "|" + status);
    }
}
