/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindaaa;

/**
 *
 * @author HP
 */
public class Dindaberaksi {
    
    public static void main(String [] args){
        
            Dindaaa kalkulator = new Dindaaa();
            
            String nama;
            nama = "Adrian";
            
            int umur;
            umur = 23;
            
            int T = 166;
            int B = 150;
            kalkulator.setTinggi((int) T);
            kalkulator.setBerat ((int) B);
            float C = (float)(kalkulator.getTotal());
            
            System.out.println("KALKULATOR BMI DINDA");
            System.out.println("____________________");
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
            System.out.println("Tinggi badan : " + T);
            System.out.println("Berat Badan : " + B);
            System.out.println("Hasil = " + Math.ceil(kalkulator.getTotal()));
            
            if(C==0){
            System.out.println("Anda belum meng-input hasil data stunting anda");
            }else if(C<=18.5){
            System.out.println("MAAF ANDA KEKURANGAN BERAT BADAN");
            }else if(C<=24.9){
            System.out.println("SELAMAT ANDA DI BATAS BERAT BADAN IDEAL");
            }else if(C<=29.9){
            System.out.println("MAAF ANDA MEMPUNYAI BERAT BADAN YANG BERLEBIH");
            }else{
            System.out.println("ANDA OBESITAS, SARAN DARI KAMI UNTUK SEGERA BERKONSULTASI");
        }
            
    }
    
}
