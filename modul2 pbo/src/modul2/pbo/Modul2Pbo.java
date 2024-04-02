package modul.pkg2.pbo;

public class Modul2PBO {
    private static String namaUniversitas;

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }
}
import java.util.Scanner;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = scanner.nextLine();
        inputJurusan(scanner);
    }

    public void inputJurusan(Scanner scanner) {
        System.out.println("Pilihan Jurusan:");
        System.out.println("41. Teknik Informatika");
        System.out.println("42. Teknik Industri");
        System.out.println("43. Teknik Elektro");
        System.out.println("44. Sistem Informasi");
        System.out.println("45. Teknik Mesin");
        System.out.println("46. Teknik Mekatronika");
        System.out.print("Masukkan Kode Jurusan (41-46): ");
        String kodeJurusan = scanner.nextLine();
        jurus+an = switch (kodeJurusan) {
            case "41" -> "Teknik Informatika";
            case "42" -> "Teknik Industri";
            case "43" -> "Teknik Elektro";
            case "44" -> "Sistem Informasi";
            case "45" -> "Teknik Mesin";
            case "46" -> "Teknik Mekatronika";
            default -> "Jurusan Tidak Dikenal";
        };
    }

    public void displayData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
    }
}
package modul.pkg2.pbo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input Nama Universitas
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        Modul2PBO.setNamaUniversitas(namaUniversitas);

        // Input Data Mahasiswa
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        char lagi;
        do {
            Mahasiswa mahasiswa = new Mahasiswa("", "", "", "");
            mahasiswa.inputData();
            daftarMahasiswa.add(mahasiswa);
            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            lagi = scanner.next().charAt(0);
            scanner.nextLine(); // Membuang karakter '\n'
        } while (lagi == 'Y' || lagi == 'y');

        // Tampilkan Daftar Mahasiswa
        System.out.println("\nDaftar Mahasiswa " + Modul2PBO.getNamaUniversitas() + ":");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1) + ":");
            daftarMahasiswa.get(i).displayData();
        }
    }
}