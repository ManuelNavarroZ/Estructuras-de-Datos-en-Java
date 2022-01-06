package EstructuraDatos;

import java.util.Scanner;

public class G {
  // Escribir un algoritmo que indique si una palabra leída del teclado es un
  // palíndromo. Un
  // palíndromo (capicúa) es una palabra que se lee igual en ambos sentidos como
  // “radar”.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string, cap = "", copy;
    System.out.println("Digite un número: ");
    string = sc.nextLine();
    copy = string;
    while (string.length() > 0) {
      cap += string.charAt(string.length() - 1);
      string = string.substring(0, string.length() - 1);
    }
    if (copy.compareTo(cap) == 0) {
      System.out.println("Es capicúa");
    } else {
      System.out.println("No es capicúa");
    }
    sc.close();
  }
}
