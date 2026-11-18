/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

import java.util.Scanner;

class PekerjaThread extends Thread {
    private final int nomor;

    PekerjaThread(int nomor) {
        this.nomor = nomor;
        setName("Thread-" + nomor);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " -> langkah " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(getName() + " terinterupsi");
            }
        }
        System.out.println(getName() + " selesai.");
    }
}

public class Class8 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread yang diinginkan: ");
        int jumlah = in.nextInt();

        PekerjaThread[] threads = new PekerjaThread[jumlah];
        for (int i = 0; i < jumlah; i++) {
            threads[i] = new PekerjaThread(i + 1);
            threads[i].start();
        }

        // Tunggu semua thread anak selesai
        for (PekerjaThread t : threads) t.join();

        System.out.println("Semua thread selesai. Thread utama berakhir.");
    }
}
    

