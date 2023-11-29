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
public class Dindaaa {
    
    double T;
    void setTinggi(float Operasi){
        T = T + Operasi;
    }
    
    double B;
    void setBerat(float Operasi){
        B = B + Operasi;
    }
    
     double getTotal(){
        return B /(T/100 * T/100);
    }   

    
}
