# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data elektronik menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama elektronik dan kode elektronik, dan memberikan output berupa informasi detail dari nama barang, kode barang, kategori barang, merek barang dan No registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Elektronik`, `ElektronikDetail`, dan `ElektronikBeraksi` adalah contoh dari class.

```bash
public class Elektronik {
    ...
}

public class ElektronikDetail extends Elektronik {
    ...
}

public class ElektronikBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `elektronikList[i] = new ElektronikDetail(nama, kode);` adalah contoh pembuatan object.

```bash
elektronikList[i] = new ElektronikDetail(nama, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kode` adalah contoh atribut.

```bash
private String nama;
private int kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Elektronik` dan `ElektronikDetail`.

```bash
public Elektronik(String nama, int kode) {
    this.nama = nama;
    this.kode = kode;
}

public ElektronikDetail(String nama, int kode) {
    super(nama, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKode` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKode(int kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama` dan `getKode` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `ElektronikDetail` mewarisi `Elektronik` dengan sintaks `extends`.

```bash
public class ElektronikDetail extends Elektronik {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Elektronik` merupakan overloading method `displayInfo` dan `displayInfo` di `ElektronikDetail` merupakan override dari method `displayInfo` di `Elektronik`.

```bash
public String displayInfo(String warna) {
    return displayInfo() + "\nWarna: " + warna;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKategori` dan seleksi `switch` dalam method `getMerek`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < elektronikList.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama produk elektronik " + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData produk elektronik:");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ElektronikDetail[] elektronikList = new ElektronikDetail[2];` adalah contoh penggunaan array.

```bash
ElektronikDetail[] elektronikList = new ElektronikDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

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

## Pembuat

Nama: Achmad Ridani
NPM: 2210010273

