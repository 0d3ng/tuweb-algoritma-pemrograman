import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // contoh array args
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumen ke-" + i + ": " + args[i]);
        }
        // definisi variabel
        int jumlah_mahasiswa = 2;
        String nilai_huruf[] = new String[jumlah_mahasiswa]; // 1 kelas, 2 mahasiswa
        String nilai_ref[] = { "A", "B", "C", "D", "E" };

        float nilai_angka[] = new float[jumlah_mahasiswa]; // 1 kelas, 2 mahasiswa
        // int nilai_tugas, nilai_uts, nilai_uas;
        int nilai_mhs[][] = new int[jumlah_mahasiswa][3]; // 1 kelas, 2 mahasiswa
        
        String keterangan[] = new String[jumlah_mahasiswa];
        // String keterangan_ref[] = { "Lulus", "Tidak Lulus" };
        Scanner input = new Scanner(System.in);

        // welcome screen
        System.out.println("=====================================");
        System.out.println("Selamat Datang di Program Penilaian Mahasiswa");
        System.out.println("=====================================");

        for (int i =0; i < nilai_mhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
        // input nilai tugas, uts, uas
        System.out.print("Masukkan Nilai Tugas  : ");
        // nilai_tugas = input.nextInt();
        nilai_mhs[i][0] = input.nextInt();


        System.out.print("Masukkan Nilai UTS    : ");
        // nilai_uts = input.nextInt();
        nilai_mhs[i][1] = input.nextInt();

        System.out.print("Masukkan Nilai UAS    : ");
        // nilai_uas = input.nextInt();
        nilai_mhs[i][2] = input.nextInt();
        }

        // menampilkan hasil input
        // System.out.println("Nilai Tugas : " + nilai_tugas);
        // System.out.println("Nilai UTS : " + nilai_uts);
        // System.out.println("Nilai UAS : " + nilai_uas);

        // menghitung nilai angka
        // nilai_angka = (float) (0.2 * nilai_tugas + 0.3 * nilai_uts + 0.5 * nilai_uas);
        for (int i = 0; i < nilai_angka.length; i++) {
            nilai_angka[i] = (float) (0.2 * nilai_mhs[i][0] + 0.3 * nilai_mhs[i][1] + 0.5 * nilai_mhs[i][2]);
        }
        // System.out.println("Nilai Angka : " + nilai_angka);

        // menentukan nilai huruf
        for (int i = 0; i < nilai_huruf.length; i++) {
            if (nilai_angka[i] >= 80) {
                // nilai_huruf = "A";
                nilai_huruf[i] = nilai_ref[0];
            } else if (nilai_angka[i] >= 60) {
                // nilai_huruf = "B";
                nilai_huruf[i] = nilai_ref[1];
            } else if (nilai_angka[i] >= 50) {
            // nilai_huruf = "C";
            nilai_huruf[i] = nilai_ref[2];
        } else if (nilai_angka[i] >= 25) {
            // nilai_huruf = "D";
            nilai_huruf[i] = nilai_ref[3];
        } else {
            // nilai_huruf = "E";
            nilai_huruf[i] = nilai_ref[4];
        }
    }

        // System.out.println("Nilai Huruf : " + nilai_huruf);

        // if (nilai_huruf.equals("A") || nilai_huruf.equals("B") || nilai_huruf.equals("C")) {
        //     // keterangan = "Lulus";
        //     keterangan = keterangan_ref[0];
        // } else {
        //     // keterangan = "Tidak Lulus";
        //     keterangan = keterangan_ref[1];
        // }
        // System.out.println("Keterangan : " + keterangan);

        for (int j = 0; j < keterangan.length; j++) {
            keterangan[j] = (nilai_huruf[j].equals("A") || nilai_huruf[j].equals("B") || nilai_huruf[j].equals("C")) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("=====================================");
        System.out.println("Rekapan Nilai Akhir Mahasiswa");
        System.out.println("======================================");
        for (int j = 0; j < nilai_mhs.length; j++) {
            System.out.println("Data Mahasiswa ke-" + (j+1));
        // System.out.printf("Nilai Tugas   : %d\n", nilai_tugas);
        System.out.printf("Nilai Tugas   : %d\n", nilai_mhs[j][0]);
        // System.out.printf("Nilai UTS     : %d\n", nilai_uts);
        System.out.printf("Nilai UTS     : %d\n", nilai_mhs[j][1]);
        // System.out.printf("Nilai UAS     : %d\n", nilai_uas);
        System.out.printf("Nilai UAS     : %d\n", nilai_mhs[j][2]);
        System.out.printf("Nilai Angka   : %.2f\n", nilai_angka[j]);
        System.out.printf("Nilai Huruf   : %s\n", nilai_huruf[j]);
        System.out.printf("Keterangan    : %s\n", keterangan[j  ]);
        System.out.println("======================================");
        input.close();
        }
    }
}
