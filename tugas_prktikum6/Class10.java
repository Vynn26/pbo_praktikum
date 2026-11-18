/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_prktikum6;

/**
 *
 * @author salmanfir
 */
public class Class10 {
    public class Soal10 {
    public static void main(String[] args) {
        // Data campuran: 19 (int), 0.2 (double), 'C' (char), "Java" (String), true (boolean)
        Object[] data = {19, 0.2, 'C', "Java", true};

        for (int i = 0; i < data.length; i++) {
            System.out.println("data[" + i + "] = " + data[i]
                    + "  (tipe: " + data[i].getClass().getSimpleName() + ")");
        }
    }
}
}
