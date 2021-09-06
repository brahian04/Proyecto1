package Prueba;

import java.util.Scanner;

public class Calculadora1 {
        public static void main(String[] args){
            Scanner entrada= new Scanner(System.in);
            System.out.println("Ingrese el primer número: ");
            double num1= entrada.nextDouble(); 
            System.out.println("Ingrese el segundo número: ");
            double num2= entrada.nextDouble();
            System.out.println("Ingrese la operación: ");
            var operador = entrada.nextLine();
            var resultado = operando(operador, num1, num2);
            System.out.println("El resultado es: " + resultado);
            entrada.close();
        }

        public static double operando(String operador, double num1, double num2){
            var aritmetica = new Operaciones();

            switch(operador){
                case "+": {
                    return aritmetica.suma(num1, num2);
                }
                case "*": {
                    return aritmetica.multiplicacion(num1,num2);
                }
                case "-": {
                    return aritmetica.resta(num1, num2);
                }
                case "/": {
                    return aritmetica.division(num1,num2);
                }
                case "sqr": {
                    return aritmetica.raiz(num1,num2);
                }
                case "%": {
                    return aritmetica.modulo(num1,num2);
                }
            }
            return 0;                    
        }
}
