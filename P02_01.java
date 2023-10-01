// 12S23017 - Andrey jonathan

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, namadosen, tanggal, format, hasil1, hasil2, hasil3;
        double tingkatkesulitan, harideadline, prioritas;
        String status, kerjakansegera, prioritasmenengah;

        program = input.nextLine();
 8        kode = input.nextLine();
        matkul = input.nextLine();
        namadosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        harideadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas > 3) {
            hasil1 = "kerjakansegera";
        } else {
            if (prioritas < 3 && prioritas > 1.5) {
                hasil2 = "prioritasmenengah";
            } else {
                if (prioritas < 1.5) {
                    hasil3 = "ez";
                }
            }
        }
        System.out.println("prioritas :" + toFixed(prioritas,2));
        System.out.println(program + "|" + kode + "|" + matkul + "|" + namadosen + "|" + tanggal + "|" + format + "|" + tingkatkesulitan + "|" + harideadline + "|" + status + "|");
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
