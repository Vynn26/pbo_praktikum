/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Class6 {
    

public class Soal6 {
    static Scanner in = new Scanner(System.in);

    // Membaca bilangan dengan penanganan kesalahan (exception handling)
    static double bacaBilangan(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: input harus berupa bilangan! Silakan ulangi.");
                in.next(); // buang input yang salah
            }
        }
    }

    static int bacaJumlah() {
        while (true) {
            try {
                System.out.print("Masukkan banyak bilangan: ");
                int n = in.nextInt();
                if (n <= 0) {
                    System.out.println("Kesalahan: jumlah harus lebih dari 0.");
                    continue;
                }
                return n;
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan: input harus berupa bilangan bulat! Silakan ulangi.");
                in.next();
            }
        }
    }

    public static void main(String[] args) {
        int n = bacaJumlah();
        double[] data = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            data[i] = bacaBilangan("Bilangan ke-" + (i + 1) + " : ");
            total += data[i];
        }

        System.out.println("\nJumlah    : " + total);
        System.out.println("Rata-rata : " + (total / n));
    }
}
    
}
