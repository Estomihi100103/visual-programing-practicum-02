//12S23046 -Anastasya Tabita Blessing Siahaan

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, format, status, rekomendasitugas;
        double tingkatkesulitan, harideadline, prioritas;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        harideadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        System.out.println(" prioritas: " + toFixed(prioritas,2));
        if (prioritas > 3.0) {
            rekomendasitugas = "penting! anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas >= 1.5 && prioritas > 3) {
                rekomendasitugas = "tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "tugas ini relatif ringan, namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + status + "|" + prioritas + "|" + rekomendasitugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

