// 12S23029 - Sintong Hutapea
import java.util.*;
import java.lang.Math;

class Program {
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
        System.out.println("Prioritas : " + prioritas);
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
        System.out.println(nama + "|" + kode + "|" + matkul + "|" + dosen + "|" + deadline + "|" + nim + "|" + tingkat + "|" + hari + "|" + status + "|" + hasil1);
    }
}
