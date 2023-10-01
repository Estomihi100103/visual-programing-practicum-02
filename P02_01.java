// 12S23022 - P.Santa Hillary Sitorus

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String mATAKULIAH, dOSEN, sTATUS, rEKOMENDASI;
        String nIM;
        double tINGKATKESULITAN, dEADLINE, pRIORITAS;

        System.out.println("masukkan NIM");
        nIM = input.nextLine();
        System.out.println("masukkan MATAKULIAH");
        mATAKULIAH = input.nextLine();
        System.out.println("masukkan DOSEN");
        dOSEN = input.nextLine();
        System.out.println("masukkan DEADLINE");
        dEADLINE = input.nextDouble();
        System.out.println("masukkan TINGKATKESULITAN");
        tINGKATKESULITAN = input.nextDouble();
        pRIORITAS = tINGKATKESULITAN * (1.0 / dEADLINE);
        if (pRIORITAS >= 3.0) {
            rEKOMENDASI = "penting anda harus mengerjakan tugas";
        } else {
            if (pRIORITAS <= 3.0 && pRIORITAS >= 1.5) {
                rEKOMENDASI = "tugas ini memiliki prioritas menengah";
            } else {
                if (pRIORITAS < 1.5) {
                    rEKOMENDASI = "tugas ini relatif ringan,namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(nIM + "|" + mATAKULIAH + "|" + dOSEN + "|" + dEADLINE + "|" + tINGKATKESULITAN + "|" + rEKOMENDASI);
    }
}
