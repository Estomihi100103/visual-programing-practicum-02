// 12S23002 - Fernando Alexander Silitonga
import java.util.*;
import java.lang.Math;

class 01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double x;
        String program, kode, matkul, dosen, tanggal, format, status, s;
        int kesulitan, hari;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        format = input.nextLine();
        kesulitan = input.nextInt();
        hari = input.nextInt();
        status = input.nextLine();
        x = kesulitan * (1.0 / hari);
        if (x > 3) {
            s = "tugas ini memiliki prioritas penting";
        } else {
            if (x < 3 && x > 1.5) {
                s = "tugas ini memiliki prioritas menengah";
            } else {
                if (x < 1.5) {
                    s = "tugas ini memiliki prioritas ringan";
                }
            }
        }
        System.out.println("Prioritas: " + toFixed(x,2));
        System.out.println(program + "|" + kode + "|" + matkul + "|" + dosen + "|" + tanggal + "|" + format + "|" + status + "|" + s);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
