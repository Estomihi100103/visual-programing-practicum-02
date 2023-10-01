// 12S23017 - Andrey jonathan

import java.util.*;
import java.lang.Math;

class P02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namakonser;
        String tanggalkonser;
        String jenistiket;
        int nomortiket;
        int hargatiket;
        int jumlahtiket;

        System.out.println("nama konser:");
        namakonser = input.nextLine();
        System.out.println("tanggal konser:");
        tanggalkonser = input.nextLine();
        System.out.println("jenis tiket:");
        jenistiket = input.nextLine();
        System.out.println("nomor tiket:");
        nomortiket = input.nextInt();
        System.out.println("harga tiket:");
        hargatiket = input.nextInt();
        System.out.println("jumlah tiket:");
        jumlahtiket = input.nextInt();
        System.out.println("Nama konser :" + namakonser);
        System.out.println("Tanggal konser:" + tanggalkonser);
        System.out.println("Jenis tiket:" + jenistiket);
        System.out.println("nomor tiket:" + nomortiket);
        System.out.println("Harga tiket:" + hargatiket);
        System.out.println("Jumlah tiket:" + jumlahtiket);
    }
}
