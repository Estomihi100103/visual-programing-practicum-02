//12S23018 - Early Natalia Sembiring
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsitugas;
        String kodematakuliah;
        String namamatakuliah;
        String pengampu;
        String deadline;
        String formatpenamaantugas;
        int tingkatkesulitan;
        int harihinggadeadline;
        String status;
        double prioritas;
        String hasil;
        String rekomendasitugas;

        deskripsitugas = input.nextLine();
        kodematakuliah = input.nextLine();
        namamatakuliah = input.nextLine();
        pengampu = input.nextLine();
        deadline = input.nextLine();
        formatpenamaantugas = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        if (prioritas > 3.0) {
            hasil = "penting! anda harus mengerjakan tugas ini segera ";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3.0) {
                hasil = "tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    hasil = "tugas ini relatif ringan,namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("prioritas:" + toFixed(prioritas,2));
        System.out.println(deskripsitugas + "|" + kodematakuliah + "|" + namamatakuliah + "|" + pengampu + "|" + deadline + "|" + formatpenamaantugas + "|" + status + "|" + hasil);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
