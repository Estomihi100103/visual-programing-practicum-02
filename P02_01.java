// 12S23045 - Chintya Reginauli Rajagukguk
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, kode, matkul, dosen, deadline, nim, status, hasil1, hasil2, hasil3;
        int tingkatkesulitan, hari;
        double prioritas;

        nama = input.nextLine();
        nim = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        hari = input.nextInt();
        deadline = input.nextLine();
        tingkatkesulitan = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / hari);
        System.out.println("Prioritas :" + toFixed(prioritas,2));
        if (prioritas > 3) {
            hasil1 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil1 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas <= 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                } else {
                    hasil1 = "prioritas tidak mencukupi";
                }
            }
        }
        System.out.println(nama + "|" + nim + "|" + kode + "|" + matkul + "|" + dosen + "|" + hari + "|" + tingkatkesulitan + "|" + deadline + "|" + status + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
