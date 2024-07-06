Tentu, berikut adalah kode yang telah disesuaikan untuk proyek akhir Anda tentang pengolahan data mahasiswa:

```java
package pbo;

// Kelas Mahasiswa
public class Mahasiswa {
    // Atribut enkapsulasi
    private String nama;
    private String npm;

    // Konstruktor
    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    // Accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    // Metode untuk menampilkan informasi dasar mahasiswa
    public String displayInfo() {
        return "Nama: " + getNama() + "\nNPM: " + getNpm();
    }

    // Polymorphism overloading
    public String displayInfo(String kelas) {
        return displayInfo() + "\nKelas: " + kelas;
    }
}
```

```java
package pbo;

// Kelas MahasiswaDetail yang mewarisi kelas Mahasiswa
public class MahasiswaDetail extends Mahasiswa {
    // Konstruktor
    public MahasiswaDetail(String nama, String npm) {
        super(nama, npm);
    }

    // Metode untuk mendapatkan tahun masuk dari NPM
    public int getTahunMasuk() {
        return Integer.parseInt(getNpm().substring(0, 2)) + 2000;
    }

    // Metode untuk mendapatkan fakultas dari NPM
    public String getFakultas() {
        String kodeFak = getNpm().substring(2, 4);
        if (kodeFak.equals("10")) {
            return "Fakultas Teknologi Informasi";
        } else {
            return "Fakultas Lain";
        }
    }

    // Metode untuk mendapatkan program studi dari NPM
    public String getProdi() {
        String kodeProdi = getNpm().substring(4, 6);
        switch (kodeProdi) {
            case "01":
                return "Teknik Informatika";
            case "02":
                return "Sistem Informasi";
            default:
                return "Prodi Lain";
        }
    }

    // Metode untuk mendapatkan nomor registrasi dari NPM
    public int getNoRegistrasi() {
        return Integer.parseInt(getNpm().substring(6));
    }

    // Polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nTahun Masuk: " + getTahunMasuk() +
               "\nFakultas: " + getFakultas() +
               "\nProgram Studi: " + getProdi() +
               "\nNo Registrasi: " + getNoRegistrasi();
    }
}
```

```java
package pbo;

import java.util.InputMismatchException;
import java.util.Scanner;

// Kelas MahasiswaBeraksi untuk menjalankan aplikasi
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        // IO sederhana dengan penanganan error
        try {
            Scanner scanner = new Scanner(System.in);

            // Array untuk menyimpan data mahasiswa
            MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];

            for (int i = 0; i < mahasiswas.length; i++) {
                System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NPM mahasiswa ke-" + (i + 1) + " (5 digit): ");
                
                int kode = scanner.nextInt();
                scanner.nextLine();  // Konsumsi newline

                // Validasi input kode
                if (String.valueOf(kode).length() != 5) {
                    throw new StringIndexOutOfBoundsException("Kode produk harus terdiri dari 5 angka.");
                }

                // Objek
                mahasiswas[i] = new MahasiswaDetail(nama, String.valueOf(kode));
            }

            for (MahasiswaDetail data : mahasiswas) {
                System.out.println("============");
                System.out.println("Data mahasiswa: ");
                System.out.println(data.displayInfo());
            }
        } catch (InputMismatchException e) {
            System.out.println("Kesalahan format input: Kode harus berupa angka.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
```

### Penjelasan Kode

**Kelas Mahasiswa**:
- Atribut `nama` dan `npm` digunakan untuk menyimpan data mahasiswa.
- Konstruktor untuk inisialisasi objek dengan `nama` dan `npm`.
- Metode setter dan getter untuk atribut `nama` dan `npm`.
- Metode `displayInfo` untuk menampilkan informasi dasar mahasiswa.
- Overloading metode `displayInfo` untuk menambahkan informasi kelas.

**Kelas MahasiswaDetail**:
- Mewarisi kelas Mahasiswa.
- Konstruktor untuk inisialisasi objek dengan `nama` dan `npm`.
- Metode `getTahunMasuk` untuk mendapatkan tahun masuk dari NPM.
- Metode `getFakultas` untuk mendapatkan fakultas dari NPM.
- Metode `getProdi` untuk mendapatkan program studi dari NPM.
- Metode `getNoRegistrasi` untuk mendapatkan nomor registrasi dari NPM.
- Overriding metode `displayInfo` untuk menambahkan informasi detail.

**Kelas MahasiswaBeraksi**:
- Menggunakan `Scanner` untuk menerima input dari pengguna.
- Array `mahasiswas` untuk menyimpan data mahasiswa.
- Loop untuk meminta input nama dan NPM mahasiswa.
- Validasi input NPM agar terdiri dari 5 digit angka.
- Menampilkan informasi mahasiswa dengan memanggil metode `displayInfo`.
- Penanganan error dengan `try-catch` untuk mengelola kesalahan input.

### Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

### Pembuat

Nama: Achmad Ridani
NPM: 2210010273
