// 12S23019 CLARASIA L. SIMANJUNTAK

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, kode, matkul, dosen, deadline, nim, status, hasil1, hasil2, hasil3;
        double tingkat, hari, prioritas;

        nama = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        deadline = input.nextLine();
        nim = input.nextLine();
        tingkat = input.nextDouble();
        hari = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkat * (1.0 / hari);
        System.out.println("Prioritas : " + toFixed(prioritas,2));
        if (prioritas > 3) {
            hasil1 = "perlu! anda harus mengerjakannya";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil1 = "Tugas ini memiliki prioritas tengah";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "tugas ini mudah namun jangan ditunda";
                }
            }
        }
        System.out.println(nama + "|" + kode + "|" + matkul + "|" + dosen + "|" + deadline + "|" + nim + "|" + tingkat + "|" + hari + "|" + status + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
