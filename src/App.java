import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // deklarasi variabel array
        float nilai_mahasiswa[] = new float[3];
        float nilai_angka;
        String nilai_huruf;

        // input data nilai mahasiswa
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS    : ");
        nilai_mahasiswa[0] = input.nextFloat();
        System.out.print("Masukkan nilai UAS    : ");
        nilai_mahasiswa[1] = input.nextFloat();
        System.out.print("Masukkan nilai Tugas  : ");
        nilai_mahasiswa[2] = input.nextFloat();

        nilai_angka = (nilai_mahasiswa[0] * 0.3f) + (nilai_mahasiswa[1] * 0.5f) + (nilai_mahasiswa[2] * 0.2f);
        System.out.println("Nilai angka: " + nilai_angka);

        // cek nilai huruf berdasarkan nilai angka
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

        System.out.println("Nilai huruf: " + nilai_huruf);

    }
}