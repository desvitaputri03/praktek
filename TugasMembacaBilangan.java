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
 * SOAL 2
 * TANGGAL : 14 MARET 2024
 */
public class TugasMembacaBilangan {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nilai");
        int nilai = scanner.nextInt();
        scanner.close();

        if (nilai > 10){
            System.out.println("invalid number");
        }
        else if (nilai == 10 ){
            System.out.println("sepuluh");
        }
        else if (nilai == 9 ){
            System.out.println("sembilan");
        }
        else if (nilai == 8 ){
            System.out.println("delapan");
        }
        else if (nilai == 7 ){
            System.out.println("tujuh");
        }
        else if (nilai == 6 ){
            System.out.println("enam");
        }
        else if (nilai == 5 ){
            System.out.println("lima");
        }
        else if (nilai == 4 ){
            System.out.println("empat");
        }
        else if (nilai == 3 ){
            System.out.println("tiga");
        }
        else if (nilai == 2 ){
            System.out.println("dua");
        }
        else if (nilai == 1 ){
            System.out.println("tiga");
        }

        switch (nilai) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}