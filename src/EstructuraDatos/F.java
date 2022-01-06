package EstructuraDatos;

import java.util.Scanner;

public class F {
  // Crear un programa para determinar los factores primos de un número entero
  // bucle For
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 0, ban = 0;
    do {
      ban = 0;
      try {
        System.out.println("Digite un número: ");
        num = sc.nextInt();
      } catch (Exception e) {
        ban = 1;
      } finally {
        sc.nextLine();
      }
    } while (ban == 1);
    sc.close();
    System.out.println("Serie fibonnaci: ");
    for (int i = 2; num > 1; i++) {
      while (num % i == 0) {
        System.out.print(i + ", ");
        num /= i;
      }
    }
  }
}