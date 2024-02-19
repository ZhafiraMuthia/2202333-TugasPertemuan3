/*
Buatlah algoritma dalam Bahasa Java, Anda akan keluar membeli migacoan jika mempunyai uang
lebih besar dari 10000 (rupiah) dan pasangan Anda sedang tidak ada kelas di kuliahnya,
yang dapat ditulis sebagai ekspresi: (uang > 10000) && (tidakAdaKelasKuliah)!
 */
package latihan;

import java.util.Scanner;

public class dua {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah uang yang Anda miliki: ");
        int uang = userInput.nextInt();

        System.out.print("Apakah pasangan Anda sedang tidak ada kelas kuliah? (true/false): ");
        boolean tidakAdaKelasKuliah = userInput.nextBoolean();

        // Memutuskan apakah akan membeli migacoan atau tidak
        if (uang > 10000 && tidakAdaKelasKuliah) {
            System.out.println("Yeay beli migacoan ama ayang!");
        } else {
            System.out.println("Ga bisa beli migacoan..");
        }

        userInput.close();
    }
}
