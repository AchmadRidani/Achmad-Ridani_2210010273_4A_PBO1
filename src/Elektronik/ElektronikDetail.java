package Elektronik;

// Inheritance
public class ElektronikDetail extends Elektronik {
    // Overriding konstruktor
    public ElektronikDetail(String nama, int kode) {
        super(nama, kode);
    }

    public String getKategori() {
        int kodeKategori = getKode() / 1000;  // Mengambil digit pertama
        // Seleksi if
        if (kodeKategori == 1) {
            return "Televisi";
        } else if (kodeKategori == 2) {
            return "Kulkas";
        } else if (kodeKategori == 3) {
            return "Mesin Cuci";
        } else {
            return "Kategori Lain";
        }
    }

    public String getMerek() {
        int kodeMerek = (getKode() / 100) % 10;  // Mengambil digit kedua
        // Seleksi switch
        switch (kodeMerek) {
            case 1:
                return "Samsung";
            case 2:
                return "LG";
            case 3:
                return "Sony";
            default:
                return "Merek Lain";
        }
    }

    public int getNoRegistrasi() {
        return getKode() % 100;  // Mengambil dua digit terakhir
    }

    // Polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nKategori: " + getKategori() +
               "\nMerek: " + getMerek() +
               "\nNo Registrasi: " + getNoRegistrasi();
    }
}
