/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_prktikum6;

import java.util.Arrays;

public class Tugas_prktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Variasi 1: deklarasi, alokasi, lalu isi per indeks
        int[] a = new int[5];
        a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50;

        // Variasi 2: deklarasi + inisialisasi langsung
        int[] b = {1, 2, 3, 4, 5};

        // Variasi 3: menggunakan new int[] {...}
        int[] c = new int[]{5, 15, 25, 35, 45};

        System.out.println("Variasi 1: " + Arrays.toString(a));
        System.out.println("Variasi 2: " + Arrays.toString(b));
        System.out.println("Variasi 3: " + Arrays.toString(c));
    }
}
    
    

