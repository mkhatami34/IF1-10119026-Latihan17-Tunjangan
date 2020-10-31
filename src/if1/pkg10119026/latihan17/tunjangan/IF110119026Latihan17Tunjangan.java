/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      tunjangan
 */
public class IF110119026Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double Tunjangan = 0.35;
        Scanner scan = new Scanner (System.in);
        int gajiPokok;
        String statusAnda;
        double hasilTunjangan = 0;
        double totalGaji;
        
        
        // Input gaji pokok dan status anda
        
        System.out.println("=======Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan : Rp.");
        gajiPokok = scan.nextInt();
        System.out.print("Status anda? ");
        statusAnda = scan.next();
        
        // validasi status menikah atau tidak
        if(statusAnda.equals("Menikah")){
            hasilTunjangan = gajiPokok * Tunjangan;
        }
        totalGaji = hasilTunjangan + gajiPokok;
        
        // Output gaji pokok
        
        System.out.println("=====Hasil Perhitngan Gaji Anda=====");
        System.out.println("Gaji pokok          : Rp." + gajiPokok);
        System.out.println("Tunjangan           : Rp." + hasilTunjangan);
        System.out.println("Total gaji          : Rp." + totalGaji);
        System.out.println("(Developed by : Muhammad Khatami)");
        
    }
    
}
