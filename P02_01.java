import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas;
        String kodeMataKuliah;
        String mataKuliah;
        String dosenPengampu;
        String deadline;
        String nIMNamaMatkul;
        double tingkatKesulitan;
        double hariHinggaDeadline;
        String status;
        double prioritas;
        String hasil;

        deskripsiTugas = input.nextLine();
        kodeMataKuliah = input.nextLine();
        mataKuliah = input.nextLine();
        dosenPengampu = input.nextLine();
        deadline = input.nextLine();
        nIMNamaMatkul = input.nextLine();
        tingkatKesulitan = input.nextDouble();
        hariHinggaDeadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariHinggaDeadline);
        System.out.println("Prioritas :" + prioritas);
        if (prioritas > 3) {
            hasil = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    hasil = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + mataKuliah + "|" + dosenPengampu + "|" + deadline + "|" + nIMNamaMatkul + "|" + tingkatKesulitan + "|" + hariHinggaDeadline + "|" + status + "|" + hasil);
    }
}
