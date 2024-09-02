/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Evelyn
 */
abstract class Mostrar {
    public abstract double calcularOperacion();
     public void mostrarOperacion() {
        System.out.println(" es: " + calcularOperacion());
    }
     
}
