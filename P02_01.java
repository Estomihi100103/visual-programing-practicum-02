// 12S23011 - Mabel Christoffel A.S

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String tugas, kodematkul, matkul, dosen, waktu, identitas, status, keterangan;
        double prioritas;
        int kesulitan, deadline;

        tugas = input.nextLine();
        kodematkul = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        waktu = input.nextLine();
        identitas = input.nextLine();
        kesulitan = input.nextInt();
        deadline = input.nextInt();
        status = input.nextLine();
        prioritas = kesulitan * (1.0 / deadline);
        if (prioritas > 3) {
            keterangan = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas <= 3 && prioritas >= 1.5) {
                keterangan = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    keterangan = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        System.out.println(tugas + "|" + kodematkul + "|" + matkul + "|" + dosen + "|" + waktu + "|" + identitas + "|" + status + "|" + keterangan);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
