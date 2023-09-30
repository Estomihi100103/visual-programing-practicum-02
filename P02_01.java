// 12S23037 - Oracle Tio Panjaitan

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String judul, nIM, subjek, nama, waktu, penamaan, status, rekomendasi;
        int tingkat, deadline;
        double prioritas;

        judul = input.nextLine();
        nIM = input.nextLine();
        subjek = input.nextLine();
        nama = input.nextLine();
        waktu = input.nextLine();
        penamaan = input.nextLine();
        tingkat = input.nextInt();
        deadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkat * (1.0 / deadline);
        if (prioritas > 3) {
            rekomendasi = "Penting! Anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas < 1.5) {
                rekomendasi = "Tugas ini memiliki prioritas menegah";
            } else {
                rekomendasi = "Tugas ini realtif ringan, namun jangan tunda terlalu lama";
            }
        }
        System.out.println("Prioritas: " + toFixed(prioritas,2) + judul + " | " + nIM + " | " + subjek + " | " + nama + " | " + waktu + " | " + penamaan + " | " + status + "|" + rekomendasi);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
