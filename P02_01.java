import java.util.*;
import java.lang.Math;

class P01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, format, status, status2;
        int tingkatKesulitan, hariDeadline;
        double prioritas;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatKesulitan = input.nextInt();
        hariDeadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariDeadline);
        System.out.println("Prioritas: " + toFixed(prioritas,2));
        if (prioritas > 3) {
            status2 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas <= 3 && prioritas >= 1.5) {
                status2 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    status2 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + status + "|" + status2);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
