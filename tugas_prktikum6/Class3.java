/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

    import java.util.Arrays;
import java.util.Scanner;

public class Class3 {
    
 
public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // a. Jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();
        int[] data = new int[n];

        // b. Input elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + " : ");
            data[i] = in.nextInt();
        }

        // c. Nilai terbesar & terkecil beserta indeksnya
        int max = data[0], min = data[0], idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > max) { max = data[i]; idxMax = i; }
            if (data[i] < min) { min = data[i]; idxMin = i; }
        }
        System.out.println("\nNilai terbesar  : " + max + " (indeks " + idxMax + ")");
        System.out.println("Nilai terkecil  : " + min + " (indeks " + idxMin + ")");

        // d. Jumlah dan rata-rata
        int total = 0;
        for (int x : data) total += x;
        double rata = (double) total / n;
        System.out.println("Jumlah semua    : " + total);
        System.out.println("Rata-rata       : " + rata);

        // e. Jumlah elemen berindeks ganjil (NPM genap)
        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2) jumlahGanjil += data[i];
        System.out.println("\nJumlah elemen indeks ganjil (NPM genap) : " + jumlahGanjil);

        // f. Jumlah elemen berindeks genap (NPM ganjil)
        int jumlahGenap = 0;
        for (int i = 0; i < n; i += 2) jumlahGenap += data[i];
        System.out.println("Jumlah elemen indeks genap (NPM ganjil) : " + jumlahGenap);

        // g. Cek hasil penjumlahan ganjil/genap
        System.out.println("\nHasil langkah e (" + jumlahGanjil + ") bernilai "
                + (jumlahGanjil % 2 == 0 ? "genap" : "ganjil"));
        System.out.println("Hasil langkah f (" + jumlahGenap + ") bernilai "
                + (jumlahGenap % 2 == 0 ? "genap" : "ganjil"));

        // h. Urutkan array
        Arrays.sort(data);
        System.out.println("\nArray setelah diurutkan (ascending): " + Arrays.toString(data));
    }
}
    
}
