// 12S23021 - Eunike Purba
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nAMATUGAS, mATAKULIAH, dOSENPENGAMPU, dEADLINE, nIMNAMATUGAS, sTATUS, rEKOMENDASITUGAS, kODEMATKUL;
        int tINGKATKESULITAN, hARIHINGGADEADLINE;
        double pRIORITAS;

        nAMATUGAS = input.nextLine();
        kODEMATKUL = input.nextLine();
        mATAKULIAH = input.nextLine();
        dOSENPENGAMPU = input.nextLine();
        dEADLINE = input.nextLine();
        nIMNAMATUGAS = input.nextLine();
        tINGKATKESULITAN = input.nextInt();
        hARIHINGGADEADLINE = input.nextInt();
        sTATUS = input.nextLine();
        pRIORITAS = tINGKATKESULITAN * (1.0 / hARIHINGGADEADLINE);
        if (pRIORITAS > 3.0) {
            rEKOMENDASITUGAS = "PENTING,HARUS MENGERJAKANNYA SEGERA";
        } else {
            if (pRIORITAS < 3.0 && pRIORITAS > 1.5) {
                rEKOMENDASITUGAS = "TUGAS INI MEMILIKI PRIORITAS MENENGAH";
            } else {
                if (pRIORITAS < 1.5) {
                    rEKOMENDASITUGAS = "TUGAS RELATIF RINGAN, JANGAN MENUNDA TERLALU LAMA";
                }
            }
        }
        System.out.println("PRIORITAS:" + toFixed(pRIORITAS,2));
        System.out.println(nAMATUGAS + "|" + kODEMATKUL + "|" + mATAKULIAH + "|" + dOSENPENGAMPU + "|" + dEADLINE + "|" + nIMNAMATUGAS + "|" + sTATUS + "|" + rEKOMENDASITUGAS);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

