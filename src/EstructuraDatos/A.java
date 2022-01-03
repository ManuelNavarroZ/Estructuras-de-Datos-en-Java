package EstructuraDatos;

import java.util.Scanner;

public class A {
    /**
     * El siguiente algoritmo pretende calcular el cociente entero de dos enteros
     * positivos
     * (un dividendo y un divisor) contando el número de veces que el divisor se
     * puede restar
     * del dividendo antes de que se vuelva de menor valor que el divisor. Por
     * ejemplo, 14/3
     * proporcionará el resultado 4 ya que 3 se puede restar de 14 cuatro veces. ¿Es
     * correcto?
     * Si
     * Justifique su respuesta.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int dividendo, divisor, resta = 0;
        System.out.print("Ingrese el dividendo: ");
        dividendo = sc.nextInt();
        System.out.print("Ingrese el divisor: ");
        divisor = sc.nextInt();
        System.out.print("Resultado de " + dividendo + "/" + divisor + " = ");
        sc.close();
        while (dividendo >= divisor) {
            resta++;
            dividendo -= divisor;
        }
        System.out.print(resta);
    }

}
