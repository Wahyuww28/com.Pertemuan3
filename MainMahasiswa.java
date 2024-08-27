package com.Pertemuan3;

public class MainMahasiswa {
    
public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa();
    Nilai nl = new Nilai();

mhs.Nama = "Alif";
mhs.Nim = "11111111";
nl.NilaiAbsen = 100;
nl.NilaiUas = 90;
nl.NilaiTugas = 100;
nl.NilaiUts = 50;
nl.NilaiAkhir = nl.NilaiAbsen * 0.1 + nl.NilaiTugas * 0.2 + nl.NilaiUts * 0.3 + nl.NilaiUas * 0.4;
System.out.println("Nama: " + mhs.Nama);

System.out.println("NIM : " + mhs.Nim);
System.out.println("Absen : " + nl.NilaiAbsen);
System.out.println("Tugas : " + nl.NilaiTugas);
System.out.println("UTS: " + nl.NilaiUts);
System.out.println("UAS : " + nl.NilaiUas);
System.out.println("Nilai Akhir :" +  nl.NilaiAkhir);

mhs.Membaca();
}



}
