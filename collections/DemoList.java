package collections;

import java.util.ArrayList; // Built-in Package untuk implementasi ArrayList
import java.util.Iterator;  // Built-in Package untuk iterasi elemen dalam koleksi
import java.util.List;      

public class DemoList {

  // Metode untuk mendemonstrasikan penggunaan List dan ArrayList
  public void demo() {
    // Deklarasi dan inisialisasi ArrayList dengan tipe data generik Object (tidak spesifik)
    List list = new ArrayList();

    // Menambahkan elemen ke dalam list
    list.add("NaufalFikriAulia"); // Menambahkan nilai bertipe data string ke list
    list.add("RizalFadly");       
    list.add("BudiArman");        
    list.add("MartaKarlina");     
    list.add("FitriHerawati");    
    list.add(500);                // Menambahkan nilai bertipe Integer ke list

    // Menghapus nilai BudiArman dari list
    list.remove("BudiArman");

    // Iterasi melalui elemen-elemen dalam list 
    for (Iterator iterator = list.iterator(); iterator.hasNext();) {
      // Mengambil elemen berikutnya dari iterator dan mengonversinya menjadi String
      String string = iterator.next().toString();
      System.out.println(string); // Menampilkan elemen
    }

    // Mengambil elemen berdasarkan indeks (indeks dimulai dari 0)
    System.out.println(list.get(0).toString());
  }

}
