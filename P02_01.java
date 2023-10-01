// 12S23023 - Lenni febriyani
import java.util.*;
import java.lang.Math;

class Program P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas;

        System.out.println("Deskripsi Tugas");
        deskripsiTugas = input.nextLine();
        String kodeMataKuliah;

        System.out.println("Kode Mata Kuliah");
        kodeMataKuliah = input.nextLine();
        String namaMataKuliah;

        System.out.println("Nama MatKul");
        namaMataKuliah = input.nextLine();
        String pengampu;

        System.out.println("Nama Dosen Pengampu");
        pengampu = input.nextLine();
        String deadline;

        System.out.println("Deadline");
        deadline = input.nextLine();
        String formatPenamaanTugas;

        System.out.println("Format Penamaan Tugas");
        formatPenamaanTugas = input.nextLine();
        int tingkatkesulitan;

        System.out.println("Tingkat kesulitan");
        tingkatkesulitan = input.nextInt();
        int hari;

        System.out.println("Hari");
        hari = input.nextInt();
        String status;

        System.out.println("Status");
        status = input.nextLine();
        double prioritas;
        String hasil1, hasil2, hasil3;

        prioritas = tingkatkesulitan * (1.0 / hari);
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
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadline + "|" + formatPenamaanTugas + "|" + tingkatkesulitan + "|" + hari + "|" + status + "|" + hasil1);
    }
}
