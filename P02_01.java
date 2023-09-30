// 12S23005 - Ariella U.C Sihombing
import java.util.*;
import java.lang.Math;

class P02_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String namaKonser;
        String tanggalKonser;
        String jenisTiket;
        int nomorTiket;
        int hargaTiket;
        int jumlahTiket;

        System.out.println("1. VIP Rp : 300000, sisa 20 tiket");
        System.out.println("2. Reguler Rp : 200000, sisa 50 tiket");
        System.out.println("3. Economy Rp : 100000, sisa 10 tiket");
        System.out.println("NamaKonser");
        System.out.println("Tanggal Konser");
        System.out.println("Jenis Tiket");
        System.out.println("Nomor Tiket");
        System.out.println("Jumlah Tiket");
        namaKonser = input.nextLine();
        tanggalKonser = input.nextLine();
        jenisTiket = input.nextLine();
        nomorTiket = input.nextInt();
        jumlahTiket = input.nextInt();
        if (jenisTiket.equals("VIP")) {
            if (jumlahTiket > 20) {
                System.out.println("JumlahTiketTidakTersedia");
            } else {
                if (jumlahTiket > 3 && jumlahTiket <= 20) {
                    hargaTiket = (int) (jumlahTiket * 300000 - 300000 * ((double) 5 / 100));
                } else {
                    hargaTiket = jumlahTiket * 300000;
                }
            }
        } else {
            if (jenisTiket.equals("Reguler")) {
                if (jumlahTiket > 50) {
                    System.out.println("JumlahTiketTidakTersedia");
                } else {
                    if (jumlahTiket > 3 && jumlahTiket <= 50) {
                        hargaTiket = (int) (jumlahTiket * 200000 - 200000 * ((double) 5 / 100));
                    } else {
                        hargaTiket = jumlahTiket * 200000;
                    }
                }
            } else {
                if (jenisTiket.equals("Economy")) {
                    if (jumlahTiket > 10) {
                        System.out.println("JumlahTiketTidakTersedia");
                    } else {
                        if (jumlahTiket > 3 && jumlahTiket <= 10) {
                            hargaTiket = (int) (jumlahTiket * 100000 - 100000 * ((double) 5 / 100));
                        } else {
                            hargaTiket = jumlahTiket * 100000;
                        }
                    }
                }
            }
        }
        System.out.println(namaKonser + "|" + tanggalKonser + "|" + jenisTiket + "|" + nomorTiket + "|" + jumlahTiket + "|" + hargaTiket);
    }
}
