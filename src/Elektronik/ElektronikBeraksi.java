package Elektronik;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElektronikBeraksi {
    public static void main(String[] args) {
        // IO sederhana
        try {
            Scanner scanner = new Scanner(System.in);

            // Array
            ElektronikDetail[] elektronikList = new ElektronikDetail[2];

            for (int i = 0; i < elektronikList.length; i++) {
                System.out.print("Masukkan nama produk elektronik " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan kode produk elektronik (5 digit) " + (i + 1) + ": ");
                
                int kode = scanner.nextInt();
                scanner.nextLine();  // Konsumsi newline

                // Validasi input kode
                if (String.valueOf(kode).length() != 5) {
                    throw new StringIndexOutOfBoundsException("Kode produk harus terdiri dari 5 angka.");
                }

                // Objek
                elektronikList[i] = new ElektronikDetail(nama, kode);
            }

            for (ElektronikDetail data : elektronikList) {
                System.out.println("============");
                System.out.println("Data produk elektronik: ");
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
