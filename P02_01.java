// 12S23032 - Seprian Siagian
import java.util.*;
import java.lang.Math;

class Program P02_01{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, format, hasil1, hasil2, hasil3, status;
        int tingkatkesulitan, harideadline;
        double prioritas;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harideadline = input.nextInt();
        status = input.nextLine();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas > 3) {
            hasil1 = "Penting!";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil1 = "Menengah";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "Ringan";
                }
            }
        }
        System.out.println("prioritas: " + toFixed(prioritas,2));
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + status + "|" + hasil1);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

