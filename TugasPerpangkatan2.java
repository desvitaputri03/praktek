/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desvita_140324;

import java.util.Scanner;
/**
 * NAMA : DESVITA PUTRI
 * NIM : 230109008
 * KELAS : MI 1C
 * SOAL 4 (do while)
 * TANGGAL : 14 MARET 2024
 */
public class TugasPerpangkatan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        
        int hasil = 1;
        int i = 1;
        
        do {
            hasil *= nilai;
            i++;
        } while (i <= pangkat);  
          System.out.println("Hasil " + nilai + " pangkat " + pangkat + " adalah: " + hasil);
    }
}