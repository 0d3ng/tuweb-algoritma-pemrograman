import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // definisi variabel
        String nilai_huruf;
        float nilai_angka;
        int nilai_tugas, nilai_uts, nilai_uas;
        String keterangan;
        Scanner input = new Scanner(System.in);

        // welcome screen
        System.out.println("=====================================");
        System.out.println("Selamat Datang di Program Penilaian Mahasiswa");
        System.out.println("=====================================");

        // input nilai tugas, uts, uas
        System.out.print("Masukkan Nilai Tugas  : ");
        nilai_tugas = input.nextInt();
        System.out.print("Masukkan Nilai UTS    : ");
        nilai_uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS    : ");
        nilai_uas = input.nextInt();

        // menampilkan hasil input
        // System.out.println("Nilai Tugas   : " + nilai_tugas);
        // System.out.println("Nilai UTS     : " + nilai_uts);
        // System.out.println("Nilai UAS     : " + nilai_uas);

        // menghitung nilai angka
        nilai_angka = (float) (0.2 * nilai_tugas + 0.3 * nilai_uts + 0.5 * nilai_uas);
        // System.out.println("Nilai Angka   : " + nilai_angka);

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
        
        // System.out.println("Nilai Huruf   : " + nilai_huruf);

        if (nilai_huruf.equals("A") || nilai_huruf.equals("B") || nilai_huruf.equals("C")) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
        // System.out.println("Keterangan     : " + keterangan);

        System.out.println("=====================================");
        System.out.println("Rekapan Nilai Akhir Mahasiswa");
        System.out.println("======================================");
        System.out.printf("Nilai Tugas   : %d\n", nilai_tugas);
        System.out.printf("Nilai UTS     : %d\n", nilai_uts);
        System.out.printf("Nilai UAS     : %d\n", nilai_uas);
        System.out.printf("Nilai Angka   : %.2f\n", nilai_angka);
        System.out.printf("Nilai Huruf   : %s\n", nilai_huruf);
        System.out.printf("Keterangan    : %s\n", keterangan);
        System.out.println("======================================");
        input.close();
    }
}
