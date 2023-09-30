// 12S23043 - Grace Tiodora
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, code, matkul, dosen, tanggal, format, x;
        double tingkatKesulitan, hariDeadline;
        double prioritas;
        String status;

        program = input.nextLine();
        code = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatKesulitan = input.nextDouble();
        hariDeadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariDeadline);
        if (prioritas > 3) {
            x = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                x = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    x = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(program + "|" + code + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + tingkatKesulitan + "|" + hariDeadline + "|" + status + "|" + x);
    }
}