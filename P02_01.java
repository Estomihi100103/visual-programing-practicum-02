// 12S23013 - Andika Immanuel Nadapdap
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, format, status;
        double tingkatKesulitan, hariDeadline, prioritas;
        String prioritas2;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatKesulitan = input.nextDouble();
        hariDeadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariDeadline);
        System.out.println("prioritas:" + toFixed(prioritas,2));
        if (prioritas > 3) {
            prioritas2 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas <= 3 && prioritas >= 1.5) {
                prioritas2 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    prioritas2 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                } else {
                    prioritas2 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + tingkatKesulitan + "|" + hariDeadline);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
