// 12S23029 - Sintong Hutapea
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nmGd, aC, lt, ktsTk, hasil;
        int kpsGd, jmBk, pgKpsGd;

        nmGd = input.nextLine();
        kpsGd = input.nextInt();
        jmBk = input.nextInt();
        aC = input.nextLine();
        lt = input.nextLine();
        ktsTk = input.nextLine();
        pgKpsGd = (int) ((double) jmBk / kpsGd * 100);
        if (pgKpsGd >= 40) {
            hasil = "Gudang Elite";
        } else {
            if (pgKpsGd >= 25) {
                hasil = "Gudang Standar";
            } else {
                if (pgKpsGd < 25) {
                    hasil = "Gudang Perlu Peningkatan";
                }
            }
        }
        System.out.println("Informasi Gudang");
        System.out.println(nmGd + "|" + kpsGd + "|" + jmBk + "|" + aC + "|" + lt + "|" + ktsTk + "|" + pgKpsGd + "|" + hasil);
    }
}
