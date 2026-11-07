import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float nilai_angka[] = new float[3];
        float nilai_akhir;
        String nilai_huruf[] = {"A", "B", "C", "D", "E"};
        String nilai_huruf_akhir;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai tugas  : ");
        nilai_angka[0] = input.nextFloat();
        System.out.print("Masukkan nilai UTS    : ");
        nilai_angka[1] = input.nextFloat();
        System.out.print("Masukkan nilai UAS    : ");
        nilai_angka[2] = input.nextFloat();

        nilai_akhir = (nilai_angka[0] * 0.2f) + (nilai_angka[1] * 0.3f) + (nilai_angka[2] * 0.5f);
        System.out.println("Nilai akhir: " + nilai_akhir);

        if (nilai_akhir >= 80) {
            nilai_huruf_akhir = nilai_huruf[0];
        } else if (nilai_akhir >= 60) {
            nilai_huruf_akhir = nilai_huruf[1];
        } else if (nilai_akhir >= 50) {
            nilai_huruf_akhir = nilai_huruf[2];
        } else if (nilai_akhir >= 25) {
            nilai_huruf_akhir = nilai_huruf[3];
        } else {
            nilai_huruf_akhir = nilai_huruf[4];
        }

        System.out.println("Nilai huruf     : " + nilai_huruf_akhir);
    }
}
