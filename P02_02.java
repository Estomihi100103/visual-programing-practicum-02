//12S23034 - Pariama Valentino
import java.util.*;
import java.lang.Math;

public class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang;
        int kapasitasgudang;
        int jumlahbukusaatini;
        int skorgudang;
        String aC;
        String lantai;
        String ketersediaanteknologi;
        String status;
        
        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        skorgudang = (int) (100 * ((double) jumlahbukusaatini / kapasitasgudang));
        if (skorgudang >= 40) {
            status = "Gedung Elit";
        } else {
            if (skorgudang >= 25) {
                status = "Gedung Standar";
            } else {
                if (skorgudang < 25) {
                    status = "Gedung Perlu Peningkatan";
                }
            }
        }
        System.out.println(namagudang + " | " + kapasitasgudang + " | " + jumlahbukusaatini + " | " + aC + " | " + lantai + " | " + ketersediaanteknologi + " | " + skorgudang + " | " + status);
    }
}
