// 12S23028 - Daniel Situmorang

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, format, hasil;
        double tingkatkesulitan, deadline, prioritas;
        String status;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        deadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / deadline);
        if (prioritas > 3.0) {
            hasil = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3.0) {
                hasil = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    hasil = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("prioritas : " + toFixed(prioritas,2));
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + status + "|" + hasil);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
