/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindaaa;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Dindaberaksi {
    
    public static void main(String [] args){
        
        String N;
        int U, T, B;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Siapa Nama Anda : ");
        N = keyboard.nextLine();
        
        System.out.print("Berapa Umur Anda : ");
        U = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi : ");
        T = keyboard.nextInt();
        
        System.out.print("Masukkan Berat : ");
        B = keyboard.nextInt();
        
            Dindaaa kalkulator = new Dindaaa();
            
            
            
            
            kalkulator.setTinggi((int) T);
            kalkulator.setBerat ((int) B);
            float TOTAL = (float)(kalkulator.getTotal());
            
            System.out.println();
            System.out.println("KALKULATOR BMI DINDA");
            System.out.println("____________________");
            System.out.println("Nama : " + N);
            System.out.println("Umur : " + U);
            System.out.println();
            System.out.println("Tinggi badan : " + T + "cm");
            System.out.println("Berat badan : " + B + "kg");
            System.out.println("____________________");
            System.out.println("Total :" + TOTAL);
            
            if(TOTAL==0){
            System.out.println("DATA ANDA TIDAK ADA");
            }else if(TOTAL<=18.5){
            System.out.println("MAAF ANDA KEKURANGAN BERAT BADAN");
            }else if(TOTAL<=24.9){
            System.out.println("SELAMAT ANDA DI BATAS BERAT BADAN IDEAL");
            }else if(TOTAL<=29.9){
            System.out.println("MAAF ANDA MEMPUNYAI BERAT BADAN YANG BERLEBIH");
            }else{
            System.out.println("ANDA OBESITAS, SARAN DARI KAMI UNTUK SEGERA BERKONSULTASI");
        }
            
    }
    
}
