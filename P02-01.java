import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String dosen, kode, matkul, nama, deadline, nim, status, hasil1, hasil2, hasil3;
        int tingkatkesulitan, hari;
        double prioritas;

        nama = input.nextLine();
        nim = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        hari = input.nextInt();
        tingkatkesulitan = input.nextInt();
        deadline = input.nextLine();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / hari);
        System.out.println("Prioritas : " + toFixed(prioritas,2));
        if (prioritas > 3.0) {
            hasil1 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3.0) {
                hasil1 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(nama + "|" + nim + "|" + kode + "|" + matkul + "|" + dosen + "|" + hari + "|" + tingkatkesulitan + "|" + deadline + "|" + status + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
