import java.util.Scanner;
public class Calculadora1 {
        public static void main(String[] args){
            Scanner entrada= new Scanner(System.in);
            var num1= 0;
            var num2= 0;
            var nume3= 0;
            System.out.println("Ingrese el primer número: ");
            num1= entrada.nextInt();
            System.out.println("Ingrese el segundo número: ");
            num2= entrada.nextInt();
            var suma= num1 + num2 ;
            
            System.out.println("El resultado es: " + suma);
        }
}
