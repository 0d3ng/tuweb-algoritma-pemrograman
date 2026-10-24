import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // definisi variabel
        int nilai_tugas, nilai_uts, nilai_uas;
        double nilai_angka;
        char nilai_huruf;
        String hasil_kelulusan;

        // input data
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas  : ");
        nilai_tugas = input.nextInt();
        System.out.print("Masukkan nilai uts    : ");
        nilai_uts = input.nextInt();
        System.out.print("Masukkan nilai uas    : ");
        nilai_uas = input.nextInt();
        System.out.println("Nilai Tugas : " + nilai_tugas);
        System.out.println("Nilai UTS   : " + nilai_uts);  
        System.out.println("Nilai UAS   : " + nilai_uas);

        // proses perhitungan
        nilai_angka = (nilai_tugas * 0.2) + (nilai_uts * 0.3) + (nilai_uas * 0.5);
        System.out.println("Nilai Angka : " + nilai_angka);

        // pengecekan nila angka untuk menentukan nilai huruf dan hasil kelulusan
        if (nilai_angka >= 80) {
            nilai_huruf = 'A';
            hasil_kelulusan = "Lulus";
        } else if (nilai_angka >= 60) {
            nilai_huruf = 'B';
            hasil_kelulusan = "Lulus";
        } else if (nilai_angka >= 50) {
            nilai_huruf = 'C';
            hasil_kelulusan = "Lulus";
        } else if (nilai_angka >= 25) {
            nilai_huruf = 'D';
            hasil_kelulusan = "Tidak Lulus";
        } else {
            nilai_huruf = 'E';
            hasil_kelulusan = "Tidak Lulus";
        }

        // menampilkan hasil
        System.out.println("Nilai Huruf : " + nilai_huruf);
        System.out.println("Hasil Kelulusan : " + hasil_kelulusan);
    }
}
