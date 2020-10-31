/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan27.hurufbesarhurufkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Huruf Besar Huruf Kecil
 */
public class PBOIF210119081Latihan27HurufBesarHurufKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Masukan Kalimat : ");
         kalimat = scanner.nextLine();
 
        String hurufBesar = kalimat.toUpperCase();
        String hurufKecil = kalimat.toLowerCase();
        
         System.out.println("----Hasil Formatting----");
 
        System.out.println("String awal: " + kalimat);
        System.out.println("String huruf besar: " + hurufBesar);
        System.out.println("String huruf kecil: " + hurufKecil);
        
        System.out.println("----------------------------------");
        System.out.println("Developed by : Muhammad Elza Abiezal");
         
    }
    
}
