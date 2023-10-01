// 12S23050 - Yolanda Septania Saragih

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namatugas, matakuliah, dosenpengampu, deadline, nimnamamatkul, status, rekomendasitugas, kodematkul;
        int tingkatkesulitan, harihinggadeadline;
        double prioritas;

        namatugas = input.nextLine();
        kodematkul = input.nextLine();
        matakuliah = input.nextLine();
        dosenpengampu = input.nextLine();
        deadline = input.nextLine();
        nimnamamatkul = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        System.out.println("prioritas:" + toFixed(prioritas,2));
        if (prioritas > 3.0) {
            rekomendasitugas = "Penting! anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas < 3.0 && prioritas > 1.5) {
                rekomendasitugas = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "Tugas ini realtif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("prioritas: " + toFixed(prioritas,2));
        System.out.println(namatugas + "|" + kodematkul + "|" + matakuliah + "|" + dosenpengampu + "|" + deadline + "|" + nimnamamatkul + "|" + status + "|" + rekomendasitugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
