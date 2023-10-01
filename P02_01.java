// 12S23049 - Clarissa Manurung

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaTugas, kode, matkul, namaDosen, deadline, format, status, hasil1, hasil2, hasil3;
        int tingkatkesulitan, harideadline;
        double prioritas;

        namaTugas = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        namaDosen = input.nextLine();
        deadline = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harideadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        System.out.println("Prioritas :" + toFixed(prioritas,2));
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
        System.out.println(namaTugas + "|" + kode + "|" + matkul + "|" + namaDosen + "|" + deadline + "|" + format + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
