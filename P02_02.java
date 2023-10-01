//12S23022 -P.Santa Hillary Sitorus

import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namagudang, aC, lantai, ketersediaanteknologi, hasil1, hasil2, hasil3, gudangelite;
        int jumlahbuku, kapasitasgudang;
        int skor;

        System.out.println("selamat datang di cidiastore");
        System.out.println("masukkan nama gudang");
        namagudang = input.nextLine();
        System.out.println("apakah tersedia AC YES/NO");
        aC = input.nextLine();
        System.out.println("jenis lantai");
        lantai = input.nextLine();
        System.out.println("fasilitas ketersediaan teknologi");
        ketersediaanteknologi = input.nextLine();
        System.out.println("masukkan jumlah buku");
        jumlahbuku = input.nextInt();
        System.out.println("masukkan kapasitas gudang");
        kapasitasgudang = input.nextInt();
        System.out.println("masukkan skor");
        skor = input.nextInt();
        if (skor >= 40) {
            hasil1 = "gudangelite";
        } else {
            if (skor >= 25) {
                hasil1 = "gudangstandar";
            } else {
                if (skor < 25) {
                    hasil1 = "gudangperlupeningkatan";
                }
            }
        }
        System.out.println(namagudang + "|" + kapasitasgudang + "|" + jumlahbuku + "|" + aC + "|" + lantai + "|" + ketersediaanteknologi + "|" + hasil1);
    }
}
