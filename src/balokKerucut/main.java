/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balokKerucut;

import java.util.Scanner;
import balokKerucut.ruang.balok;
import balokKerucut.ruang.kerucut;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class main {
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println(" ");
            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH : ");
            pilihan = pilih.nextInt();
            
            switch (pilihan){
                case 1 :
                    balok(input);
                    break;
                case 2 :
                    kerucut(input);
                    break;
                case 3 :
                    System.out.println(" ");
                    System.out.println("====Terima Kasih Telah Menggunakan :D ====");
                    break;
            }
            
        } while (pilihan!=3);     
    }
    
    public static void balok(Scanner input){
        int panjang, lebar, tinggi;
        
        System.out.print("\nPANJANG  = "); panjang = input.nextInt();
        System.out.print("LEBAR    = "); lebar = input.nextInt();
        System.out.print("TINGGI   = "); tinggi = input.nextInt();
        
        balok balok = new balok(panjang, lebar, tinggi);
        
        System.out.println("==========OUTPUT==========");
        System.out.println("LUAS PERSEGI         : " + balok.luas());
        System.out.println("KELILING PERSEGI     : " + balok.keliling());
        System.out.println("VOLUME BALOK         : " + balok.volume());
        System.out.println("LUAS PERMUKAAN BALOK : " + balok.luasPermukaan());
    }
    
    public static void kerucut(Scanner input){
        double jariJari;
        int tinggi;
        
        System.out.print("\nJARI-JARI   = "); jariJari = input.nextDouble();
        System.out.print("TINGGI      = "); tinggi = input.nextInt();
        
        kerucut kerucut = new kerucut(jariJari, tinggi);
        
        System.out.println("==========OUTPUT==========");
        System.out.println("LUAS LINGKARAN         : " + kerucut.luas());
        System.out.println("KELILING LINGKARAN     : " + kerucut.keliling());
        System.out.println("VOLUME KERUCUT         : " + kerucut.volume());
        System.out.println("LUAS PERMUKAAN KERUCUT : " + kerucut.luasPermukaan());
    }
}
