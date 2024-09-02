/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Evelyn
 */
public class Calculadora {

    public static void main(String[] args) {
        Mostrar suma,resta,division,cuadratica,negativa,limite;
        double num1,num2,num3,numero;
        Scanner cin=new Scanner(System.in);
        System.out.println("Ingrese el primero numero");
        num1=cin.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=cin.nextInt();
        System.out.println("El resultado de la suma ");
        suma= new Suma(num1, num2);
        suma.mostrarOperacion();
        resta=new Resta(num1,num2);
        System.out.println("El resultado de la resta ");
        resta.mostrarOperacion();
        division= new Division(num1,num2);
        System.out.println("El resultado de la division ");
        division.mostrarOperacion();
        System.out.println(" ");
        System.out.println("Ingrese un tercer numero");
        num3=cin.nextInt();
        
        cuadratica=new Cuadratica(num1,num2,num3);
        System.out.println("El resultado de la cuadratica positiva  ");
        cuadratica.mostrarOperacion();
        negativa= new CuadraNegativa(num1,num2,num3);
        System.out.println("El resultado de la cuadratica negativa  ");
        negativa.mostrarOperacion();
        System.out.println("Ingrese el valor al que se quiere acercar:");
        numero=cin.nextInt();
        if (numero==3) {
           System.out.println("El limite se indefine");
        }else{
            limite=new Limite(numero);
            System.out.println("El limite ");
            limite.mostrarOperacion();
        }
        
    }
    
    
}
