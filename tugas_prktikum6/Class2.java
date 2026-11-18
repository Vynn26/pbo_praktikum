/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

/**
 *
 * @author salmanfir
 */
public class Class2 {
    
    public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        // Cari indeks yang berisi "Suzuki"
        int indeks = -1;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            mobil[indeks] = "Toyota"; // nilai baru
            System.out.println("Indeks yang diubah : " + indeks);
            System.out.println("Nilai baru         : " + mobil[indeks]);
        } else {
            System.out.println("Nilai Suzuki tidak ditemukan.");
        }

        System.out.println("\nIsi array sekarang:");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println("mobil[" + i + "] = " + mobil[i]);
        }
    }
}
}
