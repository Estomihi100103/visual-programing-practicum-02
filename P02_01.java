// 12S23047 - Jennifer Hopenes Sihotang

import java.util.*;
import java.lang.Math;

class P01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaTugas, kode, matkul, namaDosen, deadline, format, status, hasil1, hasil2, hasil3;
        double prioritas;
        int hari, tingkatKesulitan;

        namaTugas = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        namaDosen = input.nextLine();
        deadline = input.nextLine();
        format = input.nextLine();
        tingkatKesulitan = input.nextInt();
        hari = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hari);
        System.out.println(" prioritas :" + toFixed(prioritas,2));
        if (prioritas > 3) {
            hasil1 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas <= 3 && prioritas >= 1.5) {
                hasil1 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas <= 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(namaTugas + "|" + kode + "|" + matkul + "|" + namaDosen + "|" + deadline + "|" + format + "|" + status + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
