// 12S23031-Matthew pangihutan
import java.util.*;
import java.lang.Math;

public class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namatugas, nim, dosenpengampu, deadline, nimnamapengumpul, status, hasil1;
        int tingkatkesulitan, harihinggadeadline;
        double prioritas;
        
        namatugas = input.nextLine();
        nim = input.nextLine();
        dosenpengampu = input.nextLine();
        deadline = input.nextLine();
        nimnamapengumpul = input.nextLine();
        status = input.nextLine();
        tingkatkesulitan = input.nextInt();
        harihinggadeadline = input.nextInt();
        prioritas = tingkatkesulitan * (1.0 / harihinggadeadline);
        System.out.println("Prioritas :" + prioritas);
        if (prioritas > 3) {
            hasil1 = "Penting! Anda harus mengerjakan tugas ini segera.";
        } else {
            if (prioritas >= 1.5 && prioritas <= 3) {
                hasil1 = "Tugas ini memiliki prioritas menengah.";
            } else {
                if (prioritas < 1.5) {
                    hasil1 = "Tugas ini relatif ringan, namun jangan tunda terlalu lama.";
                }
            }
        }
        System.out.println(namatugas + "|" + nim + "|" + dosenpengampu + "|" + deadline + "|" + nimnamapengumpul + "|" + status + "|" + namatugas + "|" + tingkatkesulitan + "|" + harihinggadeadline + "|" + status);
    }
}

