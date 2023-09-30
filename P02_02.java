//12S23010 - Tiffani Rumiris Br Butar-Butar

import java.util.*;
import java.lang.Math;

public class P02_02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas, kodeMataKuliah, namaMataKuliah, pengampu, deadline, formatPenamaanTugas, status;
        double tingkatKesulitan, hariHinggaDeadline, prioritas;
        String rekomendasi;

        deskripsiTugas = input.nextLine();
        kodeMataKuliah = input.nextLine();
        namaMataKuliah = input.nextLine();
        pengampu = input.nextLine();
        deadline = input.nextLine();
        formatPenamaanTugas = input.nextLine();
        tingkatKesulitan = Double.parseDouble(input.nextLine());
        hariHinggaDeadline = Double.parseDouble(input.nextLine());
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariHinggaDeadline);
        if (prioritas > 3) {
            rekomendasi = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                rekomendasi = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    rekomendasi = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadline + "|" + formatPenamaanTugas + "|" + status + "|" + rekomendasi);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
