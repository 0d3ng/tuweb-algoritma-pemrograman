import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // deklarasi variabel
        int nilai_tugas;
        int nilai_uts;
        int nilai_uas;
        float nilai_angka;
        String nilai_huruf;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas  : ");
        nilai_tugas = input.nextInt();
        System.out.print("Masukkan nilai UTS    : ");
        nilai_uts = input.nextInt();
        System.out.print("Masukkan nilai UAS    : ");
        nilai_uas = input.nextInt();

        System.out.println("Nilai Tugas : " + nilai_tugas);
        System.out.println("Nilai UTS   : " + nilai_uts);
        System.out.println("Nilai UAS   : " + nilai_uas);

        nilai_angka = (nilai_uas * 0.5f) + (nilai_uts * 0.3f) + (nilai_tugas * 0.2f);

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
        System.out.println("Nilai Angka : " + nilai_angka);
        System.out.println("Nilai Huruf : " + nilai_huruf);
    }
}
