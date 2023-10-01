// 12S23042 - Pretty Maria Purba
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodematakuliah, matakuliah, dosenpengampu, tanggal, pukul;
        int tingkatkesulitan, harideadline;
        double prioritas;
        String status;

        kodematakuliah = input.nextLine();
        matakuliah = input.nextLine();
        dosenpengampu = input.nextLine();
        tanggal = input.nextLine();
        pukul = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harideadline = input.nextInt();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas < 6) {
            status = "Penting! Anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas <= 6) {
                status = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 6) {
                    status = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println("prioritas :  " + toFixed(prioritas,2));
        System.out.println(kodematakuliah + "|" + matakuliah + "|" + dosenpengampu + "|" + tanggal + "|" + pukul + "|" + prioritas + "|" + status);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
} 
 