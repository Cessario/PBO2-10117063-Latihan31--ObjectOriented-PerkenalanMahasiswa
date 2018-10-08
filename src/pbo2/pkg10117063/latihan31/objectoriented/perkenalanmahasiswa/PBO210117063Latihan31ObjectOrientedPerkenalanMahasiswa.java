/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan31.objectoriented.perkenalanmahasiswa;

/*
Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampilkan data mahasiswa

 */
public class PBO210117063Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Mahasiswa mhs1 = new Mahasiswa();
   mhs1.nim = "10117063";
   mhs1.nama = "Bambang";
   mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);
   
   Mahasiswa mhs2 = new Mahasiswa();
   mhs2.nim = "10117099";
   mhs2.nama = "Wahid Fachrian";
   mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
   
   Mahasiswa mhs3 = new Mahasiswa();
   mhs3.nim = "10117099";
   mhs3.nama = "Teguh Suroso";
   mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
   
   Mahasiswa mhs4 = new Mahasiswa();
   mhs4.nim = "10117099";
   mhs4.nama = "Chiqo Siswanto";
   mhs4.perkenalkanDiri(mhs4.nim, mhs4.nama);
    }
    
}
