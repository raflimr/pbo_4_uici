package collections;

import java.util.Scanner; // Built-in package untuk membaca input dari pengguna
import java.util.Arrays;  // Built-in package untuk manipulasi array seperti penyalinan array

public class DemoArray {

  // Metode untuk mendeklarasikan array
  public void declareArray() {

    // Deklarasi Array cara pertama
    String[] nama; // 

    // Deklarasi Array cara kedua
    String nama2[]; // 

    // Deklarasi Array cara ketiga
    String[] nama3 = new String[5]; // Mendeklarasikan sekaligus mengalokasikan ukuran 5 elemen

    // Menampilkan ukuran array
    System.out.println("ukuran array nama3: " + nama3.length);
  }

  // Metode untuk membuat dan mengisi nilai array
  public void createArray() {
    // Membuat array sekaligus mengisinya dengan nilai
    String[] nama = { "Linda", "Santi", "Susan", "Mila", "Ayu" };

    // Menampilkan elemen array saat inisiasi
    System.out.println("List nama ketika inisiasi");
    for (int i = 0; i < nama.length; i++) {
      System.out.println(nama[i]);
    }

    // Mengubah nilai elemen array berdasarkan indeks
    nama[0] = "Linda 2";
    nama[1] = "Santi 2";
    nama[2] = "Susan 2";
    nama[3] = "Mila 2";
    nama[4] = "Ayu 2";

    // Menampilkan elemen array setelah diubah
    System.out.println("List nama ketika di assign ulang");
    for (int i = 0; i < nama.length; i++) {
      System.out.println(nama[i]);
    }
  }

  // Metode untuk mengambil elemen array berdasarkan indeks
  public void getArrayMember(int index) {
    String[] nama = { "Linda", "Santi", "Susan", "Mila", "Ayu" };
    // Menampilkan elemen array sesuai indeks
    System.out.println(nama[index]);
  }

  // Metode untuk menyalin dan memperbesar array
  public void copyArray() {
    // Deklarasi dan inisialisasi array
    String[] nama = { "Linda", "Santi", "Susan", "Mila", "Ayu" };

    // Menyalin array dan memperbesar ukurannya menjadi 7
    String[] namaCopy = Arrays.copyOf(nama, 7);
    System.out.println("List nama setelah di-copy");
    for (int i = 0; i < namaCopy.length; i++) {
      System.out.println(namaCopy[i]);
    }

    // Menambahkan elemen baru pada indeks yang belum terisi
    namaCopy[5] = "Winda";
    namaCopy[6] = "Ani";

    // Menampilkan array setelah diubah
    System.out.println("List nama setelah di-copy dan assign");
    for (int i = 0; i < namaCopy.length; i++) {
      System.out.println(namaCopy[i]);
    }
  }

  // Metode untuk bekerja dengan array multi-dimensi
  public void multiDimension() {
    // Deklarasi array 2 dimensi
    String[][] kontak = {
        { "Lili", "08111" },
        { "Lala", "08122" },
        { "Maya", "08133" }
    };

    // Menampilkan isi array
    for (int i = 0; i < kontak.length; i++) {
      System.out.println("Nama: " + kontak[i][0]);
      System.out.println("Nomor: " + kontak[i][1]);
    }
  }

  // Metode untuk simulasi pengisian tempat duduk di ruang kelas
  public void demoRuangKelas() {
    
    // Deklarasi array 2 dimensi untuk meja
    String[][] meja = new String[2][3];
    Scanner scan = new Scanner(System.in); // Menerima inputan dari pengguna menggunakan Scanner

    // Mengisi nilai array dengan input pengguna
    for (int bar = 0; bar < meja.length; bar++) {
      for (int kol = 0; kol < meja[bar].length; kol++) {
        System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar + 1, kol + 1);
        meja[bar][kol] = scan.nextLine();
      }
    }

    // Menampilkan tabel tempat duduk
    System.out.println("-------------------------");
    for (int bar = 0; bar < meja.length; bar++) {
      for (int kol = 0; kol < meja[bar].length; kol++) {
        System.out.format("| %s | \t", meja[bar][kol]);
      }
      System.out.println(""); // Ganti baris
    }
    System.out.println("-------------------------");

    scan.close(); // Menutup scanner
  }

}
