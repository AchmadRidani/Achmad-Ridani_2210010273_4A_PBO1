package Elektronik;

public class Elektronik {
    // Atribut enkapsulasi
    private String nama;
    private int kode;

    // Konstruktor
    public Elektronik(String nama, int kode) {
        this.nama = nama;
        this.kode = kode;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public int getKode() {
        return kode;
    }

    public String displayInfo() {
        return "Nama: " + getNama() +
               "\nKode: " + getKode();
    }

    // Polymorphism overloading
    public String displayInfo(String warna) {
        return displayInfo() + "\nWarna: " + warna;
    }
}
