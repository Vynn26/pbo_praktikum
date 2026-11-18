/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

    import java.util.Scanner;
public class Class4 {
    
    

public class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = in.nextInt();
        in.nextLine(); // buang enter

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = in.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = in.nextInt();
            in.nextLine();

            status[i] = (nilai[i] <= 50) ? "Tidak Lulus" : "Lulus";
        }

        System.out.println("\n          Daftar Nilai Mahasiswa");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-5s %-20s %-8s %-12s%n", "No", "Nama", "Nilai", "Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d %-20s %-8d %-12s%n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("------------------------------------------------------");
    }
}
    
}
