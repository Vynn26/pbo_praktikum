/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

/**
 *
 * @author salmanfir
 */
// Kelas baru yang mewarisi Thread
class ThreadSaya extends Thread {
    // Method run() = titik entri thread baru
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread baru berjalan: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread terinterupsi: " + e.getMessage());
            }
        }
    }
}

public class Class7 {
    public static void main(String[] args) {
        ThreadSaya t = new ThreadSaya(); // buat objek
        t.start();                       // memulai eksekusi (memanggil run)
        System.out.println("Thread utama selesai dijalankan.");
    }
}