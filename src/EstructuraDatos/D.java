package EstructuraDatos;

import java.util.Scanner;

public class D {
  // Mostrar la serie de fibonnaci
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, num;
    System.out.println("Digite un numero: ");
    num = sc.nextInt();
    a = 1;
    b = 0;
    c = 0;
    System.out.println("Serie: ");
    for (int i = 0; i < num; i++) {
      System.out.print(c + " , ");
      c = a + b;
      a = b;
      b = c;
    }
  }

}
