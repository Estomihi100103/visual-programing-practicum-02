//  12S23038 - Alya Triswani

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi;
        int kapasitasgudang, jumlahbukusaatini;
        String informasigudang;

        namagudang = input.nextLine();
        kapasitasgudang = input.nextInt();
        jumlahbukusaatini = input.nextInt();
        aC = input.nextLine();
        lantai = input.nextLine();
        ketersediaanteknologi = input.nextLine();
        System.out.println("Informasi gudang: ");
        System.out.println(namagudang + " | " + kapasitasgudang + " | " + jumlahbukusaatini + " | " + aC + " | " + lantai + " | " + ketersediaanteknologi);
    }
}

