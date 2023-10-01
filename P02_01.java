// 12S23051 - Theresia Silaban
import java.util.*;
import java.lang.Math;

class P01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namatugas, kodematkul, matkul, pengampu, tanggal, formatpengumpulan, status, hasil1, hasil2, hasil3;
        double prioritas;
        int tingkatkesulitan, harideadline;

        namatugas = input.nextLine();
        kodematkul = input.nextLine();
        matkul = input.nextLine();
        pengampu = input.nextLine();
        tanggal = input.nextLine();
        formatpengumpulan = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harideadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas > 3) {
            hasil1 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil1 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("prioritas : " + toFixed(prioritas,2));
        System.out.println(kodematkul + "|" + matkul + "|" + pengampu + "|" + tanggal + "|" + formatpengumpulan + "|" + tingkatkesulitan + "|" + harideadline + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
