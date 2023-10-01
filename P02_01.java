//  12S23038 - Alya Triswani

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsitugas, kodematakuliah, namamatakuliah, dosenpengampu, deadline, formatpenamaantugas, rekomendasitugas, status;
        double prioritas;
        double tingkatkesulitan, harideadline;

        deskripsitugas = input.nextLine();
        kodematakuliah = input.nextLine();
        namamatakuliah = input.nextLine();
        dosenpengampu = input.nextLine();
        deadline = input.nextLine();
        formatpenamaantugas = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        harideadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas > 3.0) {
            rekomendasitugas = "Penting!Anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas < 3.0 && prioritas > 1.5) {
                rekomendasitugas = "Tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("prioritas:" + toFixed(prioritas,2));
        System.out.println(deskripsitugas + "|" + kodematakuliah + "|" + namamatakuliah + "|" + dosenpengampu + "|" + deadline + "|" + formatpenamaantugas + "|" + tingkatkesulitan + "|" + harideadline + "|" + status + "|" + rekomendasitugas);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

