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
 * SOAL 1
 * TANGGAL : 14 MARET 2024
 */

public class TugasNilai {
    
    public static void main (String [] args){
         Scanner scanner = new Scanner(System.in);
           System.out.println("masukan nilai bilangan 1");
          int nilai1 = scanner.nextInt();
            System.out.println("masukan nilai bilangan 2");
          int nilai2 = scanner.nextInt();
            System.out.println("masukan nilai bilangan 3");
          int nilai3 = scanner.nextInt();
            scanner.close();

          float rata_rata = (nilai1 + nilai2 + nilai3)/3;

          if (rata_rata >= 60){
            System.out.println(":)");
          }else {
            System.out.println(":(");
          }
    }
}