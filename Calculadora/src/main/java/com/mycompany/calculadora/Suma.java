/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Evelyn
 */
class Suma extends Mostrar {

    private double numeroUno;
    private double numeroDos;

    public Suma(double numeroUno, double numeroDos){
    
    this.numeroUno=numeroUno;
     
    this.numeroDos  = numeroDos;

}
    @Override
    public double calcularOperacion(){
        return numeroUno+numeroDos;
    }
}
