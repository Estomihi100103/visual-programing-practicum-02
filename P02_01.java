// 12S23005 - Ariella U.C Sihombing
import java.util.*;
import java.lang.Math;

public class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas;
        String kodeMataKuliah;
        String namaMataKuliah;
        String pengampu;
        String deadline;
        String formatPenamaanTugas;
        double tingkatKesulitan, hariDeadline;
        double prioritas;
        String status;

        deskripsiTugas = input.nextLine();
        kodeMataKuliah = input.nextLine();
        namaMataKuliah = input.nextLine();
        pengampu = input.nextLine();
        deadline = input.nextLine();
        formatPenamaanTugas = input.nextLine();
        tingkatKesulitan = Double.parseDouble(input.nextLine());
        hariDeadline = Double.parseDouble(input.nextLine());
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / hariDeadline);
        if (prioritas > 3) {
            status = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                status = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    status = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadline + "|" + formatPenamaanTugas + "|" + tingkatKesulitan + "|" + hariDeadline + "|" + status + "|");
    }
}
