package EstructuraDatos;

import java.util.Scanner;

public class E {
  /*
   * Crear un programa que calcule la descompoción de factores primos de un numero
   * entero
   */
  // Ciclo While
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean ban = false;
    int num = 0, i = 2;
    do {
      ban = false;
      try {
        System.out.print("Digite un número entero: ");
        num = sc.nextInt();
      } catch (Exception e) {
        ban = true;
      } finally {
        sc.nextLine();
      }
    } while (ban);
    sc.close();
    System.out.println("Factores Primos: ");
    while (num > 1) {
      if (num % i == 0) {
        System.out.print(i + ", ");
        num /= i;
      } else {
        i++;
      }
    }
    sc.close();
  }
}