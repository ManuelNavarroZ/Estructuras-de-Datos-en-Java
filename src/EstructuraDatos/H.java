package EstructuraDatos;

import java.util.Scanner;

public class H {
  // diseñar un algoritmo para determinar se un numero n es primo
  // (un número primo solo puede dividirse por el mismo y la unidad)
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, cont = 0;
    System.out.print("Digite un número: ");
    num = sc.nextInt();
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        cont++;
      }
    }
    if (cont > 0) {
      System.out.println("No es primo");
    } else {
      System.out.println("Es primo");
    }
    sc.close();
  }
}
