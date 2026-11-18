/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

/**
 *
 * @author salmanfir
 */
public class Class9 {
    public class Soal9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Perulangan 1: for
        System.out.println("Menggunakan for:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        // Perulangan 2: while
        System.out.println("\nMenggunakan while:");
        int i = 0;
        while (i < age.length) {
            System.out.println("age[" + i + "] = " + age[i]);
            i++;
        }
    }
}
}
