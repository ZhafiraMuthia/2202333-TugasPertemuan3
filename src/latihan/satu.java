/*
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah bilangan
bulat negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan tersebut!
*/

package latihan;

import java.util.Scanner;

public class satu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan pertama : ");
        int bilangan1 = userInput.nextInt();
        System.out.print("Masukkan bilangan kedua   : ");
        int bilangan2 = userInput.nextInt();
        System.out.print("Masukkan bilangan ketiga  : ");
        int bilangan3 = userInput.nextInt();

        // Menampilkan hasil operasi
        int hasilTambah = bilangan1 + bilangan2 + bilangan3;
        System.out.println("Hasil Penjumlahan   : " + hasilTambah);

        int hasilKurang = bilangan1 - bilangan2 - bilangan3;
        System.out.println("Hasil Pengurangan   : " + hasilKurang);

        // Menampilkan hasil operasi perkalian
        int hasilKali = bilangan1 * bilangan2 * bilangan3;
        System.out.println("Hasil Perkalian     : " + hasilKali);

        if (bilangan2 != 0 && bilangan3 != 0) {
            double hasilBagi = bilangan1 / bilangan2 / bilangan3;
            System.out.println("Hasil Pembagian     : " + hasilBagi);
        } else {
            System.out.println("Pembagian tidak dapat dilakukan karena bilangan kedua atau ketiga adalah nol.");
        }

        userInput.close();
    }
}
