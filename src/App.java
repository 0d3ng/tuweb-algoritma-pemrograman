import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // definisi variabel
        String nilai_huruf;
        float nilai_angka;
        int nilai_tugas, nilai_uts, nilai_uas;
        Scanner input = new Scanner(System.in);

        // input nilai tugas, uts, uas
        System.out.print("Masukkan Nilai Tugas  : ");
        nilai_tugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS    : ");
        nilai_uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS    : ");
        nilai_uas = input.nextInt();

        // menampilkan hasil input
        System.out.println("Nilai Tugas   : " + nilai_tugas);
        System.out.println("Nilai UTS     : " + nilai_uts);
        System.out.println("Nilai UAS     : " + nilai_uas);

        // menghitung nilai angka
        nilai_angka = (float) (0.2 * nilai_tugas + 0.3 * nilai_uts + 0.5 * nilai_uas);
        System.out.println("Nilai Angka   : " + nilai_angka);

        // menentukan nilai huruf
        if (nilai_angka >= 80) {
            nilai_huruf = "A";
        } else if (nilai_angka >= 60) {
            nilai_huruf = "B";
        } else if (nilai_angka >= 50) {
            nilai_huruf = "C";
        } else if (nilai_angka >= 25) {
            nilai_huruf = "D";
        } else {
            nilai_huruf = "E";
        }
        System.out.println("Nilai Huruf   : " + nilai_huruf);
    }
}
