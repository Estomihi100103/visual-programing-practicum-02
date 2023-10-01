// 12S23009 - Dina Marlina Siagian
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama;
        String kode;
        String matkul;
        String dosen;
        String deadline;
        String nim;
        double hari;
        String status;
        String hasil1;
        double tingkat, prioritas;

        nama = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        deadline = input.nextLine();
        nim = input.nextLine();
        tingkat = input.nextDouble();
        hari = input.nextDouble();
        prioritas = tingkat * (1.0 / hari);
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
        System.out.println(nama + "|" + kode + "|" + matkul + "|" + dosen + "|" + deadline + "|" + nim + "|" + tingkat + "|" + hari + "|" + hasil1);
    }
}
