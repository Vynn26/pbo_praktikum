/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

import java.util.Scanner;

public class Class5 {
    
    

public class Soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris   : ");
        int baris = in.nextInt();
        System.out.print("Masukkan jumlah kolom   : ");
        int kolom = in.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("\nMasukkan elemen matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = in.nextInt();
            }

        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = in.nextInt();
            }

        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                C[i][j] = A[i][j] + B[i][j];

        tampil("Matriks A", A);
        tampil("Matriks B", B);
        tampil("Hasil A + B", C);
    }

    static void tampil(String judul, int[][] m) {
        System.out.println("\n" + judul + ":");
        for (int[] baris : m) {
            for (int v : baris) System.out.print(v + "\t");
            System.out.println();
        }
    }
}
    
}
