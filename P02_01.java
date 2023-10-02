// 12S23026_Arif M. Doloksaribu
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, format, kinerja;
        double tingkatkesulitan, harideadline, prioritas;
        String status;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        harideadline = input.nextDouble();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas > 3) {
            kinerja = "penting! harus segera dikerjakan";
        } else {
            if (prioritas <= 3 && prioritas >= 1.5) {
                kinerja = "tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    kinerja = "tugas ini relatif ringan, namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println("prioritas : " + toFixed(prioritas,2));
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + kinerja + "|" + tingkatkesulitan + "|" + harideadline + "|" + status);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
