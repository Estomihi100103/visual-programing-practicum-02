import java.util.*;
import java.lang.Math;

class  prak {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaGudang;
        int kapasitasGudang;
        int jumlahBukuSaatIni;
        String aC;
        String lantai;
        String ketersediaanTeknologi;

        namaGudang = input.nextLine();
        kapasitasGudang = input.nextInt();
        jumlahBukuSaatIni = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        System.out.print(namaGudang + " | " + kapasitasGudang + " | " + jumlahBukuSaatIni + " | " + aC + " | " + lantai + " | " + ketersediaanTeknologi);
    }
}
