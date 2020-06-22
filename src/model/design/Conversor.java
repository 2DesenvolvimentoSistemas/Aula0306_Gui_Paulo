/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author paulo
 */
public class Conversor {
    
    // Metodo que converte de celsius para fahreheint
    public double celFah(double cel){
        return 9 * cel / 5 + 32;
        
    }
    public double fahCel(double fah){
        return (fah - 32) / 9 * 5;
    }
    
}
