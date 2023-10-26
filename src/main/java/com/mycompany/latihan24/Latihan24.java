/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan24;
import java.util.Scanner;
/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program untuk Perbandingan dua buah nilai
 */
public class Latihan24 {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        
        while(ulangi){
            System.out.println("Masukan nilai pertama\t:");
            int nilai1 = input.nextInt();
            System.out.println("Masukan nilai kedua\t:");
            int nilai2 = input.nextInt();
            
            if(nilai1 > nilai2){
                System.out.println(nilai1+"lebih kecil dari" +nilai2);
            } else if(nilai1 < nilai2){
                System.out.println("lebih kecil dari" +nilai2);
            } else{
                System.out.println(nilai1+ "sama dengan" +nilai2);
            }
            System.out.println("ulangi aktifitas? (ya/tidak");
            String aktifitas = input.next();
            if(aktifitas.equals("Ya")){
                System.out.println("Program akan diulangi");
            } else if(aktifitas.equals("Tidak")){
                System.out.println("Program Berhenti Terimakasih");
                ulangi = false;
            }
        }
    }
}
