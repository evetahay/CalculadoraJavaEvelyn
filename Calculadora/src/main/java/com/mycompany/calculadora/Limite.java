/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Evelyn
 */
class Limite extends Mostrar {
    private double x;
    public Limite(double x){
            
    
    this.x=x;
     
    

}
    @Override
    public double calcularOperacion(){
        return (x+2)/(x-3);
    }
}
