/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Evelyn
 */
class Cuadratica extends Mostrar {

    private double numeroUno;
    private double numeroDos;
    private double numeroTres;

    public Cuadratica(double numeroUno, double numeroDos, double numeroTres) {

        this.numeroUno = numeroUno;

        this.numeroDos = numeroDos;
        this.numeroTres = numeroTres;

    }

    @Override
    public double calcularOperacion() {
        return (-numeroDos + Math.sqrt((numeroDos * numeroDos) - (4 * numeroUno * numeroTres))) / (2 * numeroUno);
    }
}
