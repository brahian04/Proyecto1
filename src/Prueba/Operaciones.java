package Prueba;

public class Operaciones {
    //Atributos
    // protected double numero1;
    // protected double numero2;
    //Constructor
    // Operaciones(double numero1, double numero2){
    //     this.numero1 = numero1;
    //     this.numero2 = numero2;
    // }

    public double suma(double numero1, double numero2){
        return(numero1 + numero2);
    }
    public double resta(double numero1, double numero2){
        return(numero1 - numero2);
    }
    public double multiplicacion(double numero1, double numero2){
        return(numero1 * numero2);
    }
    public double division(double numero1, double numero2){
        return(numero1 / numero2);
    }
    public double raiz(double numero1, double numero2){
        return(Math.pow(numero1, 1/numero2));
    }
    public double modulo(double numero1, double numero2){
        return(numero1 % numero2);
    }

}
