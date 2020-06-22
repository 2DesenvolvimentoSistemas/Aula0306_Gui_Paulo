/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Conversor;

/**
 *
 * @author paulo
 */
public class TesteConversor {
    public static void main(String[] args) {
        //criação e instância do objeto da classe conversor
        Conversor con = new Conversor();
        
        System.out.println("\n\t\t\t --Convertendo °C para °F--\n");
        System.out.printf("%.2f°C -- %.2f°F\n",0.0, con.celFah(0.0));
        System.out.printf("%.2f°C -- %.2f°F\n",-40.0, con.celFah(-40.0));
        System.out.printf("%.2f°C -- %.2f°F\n",38.0, con.celFah(38.0));
    }
    
}
