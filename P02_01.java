// 12S23047 - Jennifer Hopenes Sihotang

import java.util.*;
import java.lang.Math;

class 01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String deskripsiTugas;
        String kodeMataKuliah;
        String namaMataKuliah;
        String pengampu;
        String deadLine;
        String formatPenamaanTugas;

        deskripsiTugas = input.nextLine();
        kodeMataKuliah = input.nextLine();
        namaMataKuliah = input.nextLine();
        pengampu = input.nextLine();
        deadLine = input.nextLine();
        formatPenamaanTugas = input.nextLine();
        System.out.println(deskripsiTugas + "|" + kodeMataKuliah + "|" + namaMataKuliah + "|" + pengampu + "|" + deadLine + "|" + formatPenamaanTugas);
    }
}
