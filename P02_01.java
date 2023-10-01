// 12S23034 - Pariama Valentino
import java.util.*;
import java.lang.Math;

public class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program;
        String code;
        String dosen;
        String mataKuliah;
        String tanggal;
        String format;
        String keterangan;
        String status;
        double tingkatKesulitan;
        double deadline;
        double prioritas;
        
        program = input.nextLine();
        code = input.nextLine();
        mataKuliah = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatKesulitan = input.nextDouble();
        deadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatKesulitan * (1.0 / deadline);
        if (prioritas > 3) {
            keterangan = "Penting ! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                keterangan = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    keterangan = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                } else {
                    keterangan = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(program + "|" + code + "|" + mataKuliah + "|" + dosen + "|" + tanggal + "|" + format + "|" + tingkatKesulitan + "|" + deadline + "|" + status + "|" + keterangan);
    }
}
