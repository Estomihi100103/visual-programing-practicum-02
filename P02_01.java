// 12S23008 -Ranty Insen Pakpahan
import java.util.*;
import java.lang.Math;

class P01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String studikasus;
        String nim;
        String tugas;
        String dosen;
        String haridanwaktupengumpulan;
        String format;
        double tingkatkesulitan;
        double harihinggadeadline;
        String status;
        double h;
        String variabel;

        studikasus = input.nextLine();
        nim = input.nextLine();
        tugas = input.nextLine();
        dosen = input.nextLine();
        haridanwaktupengumpulan = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        harihinggadeadline = input.nextDouble();
        status = input.nextLine();
        h = tingkatkesulitan * (1.0 / harihinggadeadline);
        if (h > 3) {
            status = "Penting!Anda harus mengerjakan tugas ini segera";
        } else {
            if (h < 3) {
                status = "Tugas ini memiliki prioritas menengah";
            } else {
                if (h < 1.5) {
                    status = "Tugas ini relatif ringan, namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(studikasus + "|" + tugas + "|" + dosen + "|" + haridanwaktupengumpulan + "|" + format + "|" + tingkatkesulitan + "|" + harihinggadeadline + "|" + status);
    }
}
