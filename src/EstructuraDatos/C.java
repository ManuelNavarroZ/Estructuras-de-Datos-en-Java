package EstructuraDatos;

import java.util.Scanner;

public class C {
  /*
   * Diseñar un algoritmo que calcule el número de veces que una cadena de
   * caracteres
   * aparece como una subcadena de otra cadena. Por ejemplo, abc aparece dos veces
   * en
   * la cadena abcdabc, y la cadena aba aparece dos veces en la cadena ababa
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cad, subcad, copy;
    
    System.out.print("Ingrese la subcadena: ");
    subcad = sc.nextLine();
    System.out.print("Ingrese la cadena: ");
    cad = sc.nextLine();
    copy = cad;
    int i = 0, k = 0;
    do {
      i = 0;
      while (i < subcad.length() && subcad.charAt(i) == cad.charAt(i)) {
        i++;
      }
      if (i == subcad.length()) {
        k++;
      }
      cad = cad.substring(1, cad.length());
    } while (cad.length() >= subcad.length());
    System.out.println(subcad + " aparece " + k + " veces en la cadena " + copy);
    sc.close();
  }

}
