//12S23004-Poppy Sibuea

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namatugas, matakuliah, dosen, matkul, status, rekomendasitugas, kode;
        int tingkatkesulitan, deadline;
        double prioritas;

        namatugas = input.nextLine();
        matakuliah = input.nextLine();
        dosen = input.nextLine();
        matkul = input.nextLine();
        status = input.nextLine();
        rekomendasitugas = input.nextLine();
        kode = input.nextLine();
        tingkatkesulitan = input.nextInt();
        deadline = input.nextInt();
        prioritas = input.nextDouble();
        if (prioritas > 3.0) {
            rekomendasitugas = "penting! anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas >= 1.5 && prioritas > 3) {
                rekomendasitugas = "tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "tugas ini relatif ringan,namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(Double.toString(prioritas) + toxifed(prioritas, 2));
        System.out.println(namatugas + "|" + kode + "|" + matkul + "|" + dosen + "|" + deadline + "|" + kode + "|" + status + "|" + prioritas + "|" + rekomendasitugas);
    }
}
