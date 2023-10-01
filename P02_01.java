// 12S23027 - Amos Raphael Manurung

import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namatugas, matakuliah, dosenpengampu, deadline, nimnamamatkul, status, rekomendasi, kodematkul;
        int tingkatkesulitan, harihinggadeadline;
        double prioritas;

        namatugas = input.nextLine();
        kodematkul = input.nextLine();
        matakuliah = input.nextLine();
        dosenpengampu = input.nextLine();
        deadline = input.nextLine();
        nimnamamatkul = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        if (prioritas > 6) {
            rekomendasi = "penting!anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas < 6 && prioritas > 1.5) {
                rekomendasi = "penting!ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    rekomendasi = "penting!anda harus mengerjakan tugas ini segera";
                }
            }
        }
        System.out.println(namatugas + "|" + matakuliah + "|" + dosenpengampu + "|" + deadline + "|" + nimnamamatkul + "|" + tingkatkesulitan + "|" + harihinggadeadline + "|" + status + "|" + rekomendasi);
    }
}
