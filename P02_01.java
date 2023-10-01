// 12S23001 - Kevin Gultom

import java.util.*;
import java.lang.Math;

class Program P02_01{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String tema, nIM, subjek, dosen, waktu, penamaanFileTugas, status, rekomendasiTugas;
        int tingkatKesulitan, hari;
        double prioritas;

        tema = input.nextLine();
        nIM = input.nextLine();
        subjek = input.nextLine();
        dosen = input.nextLine();
        waktu = input.nextLine();
        penamaanFileTugas = input.nextLine();
        tingkatKesulitan = input.nextInt();
        hari = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hari);
        if (prioritas > 3) {
            rekomendasiTugas = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas > 1.5) {
                rekomendasiTugas = "Tugas ini memiliki prioritas menengah.";
            } else {
                rekomendasiTugas = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
            }
        }
        System.out.println("Prioritas : " + toFixed(prioritas,2));
        System.out.println(tema + "|" + nIM + "|" + subjek + "|" + dosen + "|" + waktu + "|" + penamaanFileTugas + "|" + status + "|" + rekomendasiTugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
