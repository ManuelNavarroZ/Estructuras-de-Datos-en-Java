package EstructuraDatos;

public class B {
  public static boolean esPrimo(int n){
    for (int i = 2; i*i <=n; i++) {
      if (n%i==0){
        return false;
      }
    }

    return true;
  } 
  /*
    El siguiente algoritmo está diseñado para calcular el producto de dos enteros negativos x e y por 
    acumulación de la suma de copias de y (es decir, 4 por 5 se calcula acumulando la suma de cuatro 
    cinco veces). ¿Es correcto? Justifique su respuesta:no debido a que los si creo un bucle 
  */
  //función para calcular el producto de dos numeros
  public static int Producto(int x,int y){
    int s = 0, n=0;//1,1
    while(n<x){   //n
      s+=y;       //1
      n++;        //n
    }
    return s;
  }
  public static int Dividir(int divisor,int dividendo){//funcion que permite dividir dos numeros enteros positivos
    int cont =0;  //1
    do{ 
      if(divisor>=dividendo){  //1 
        divisor-=dividendo;    //1
        cont++;                //n
      }
    }while(divisor>=dividendo);//n
    return cont;
  }
  /**
   * Determinar la O-grande de los algoritmos escritos en los ejercicios 1.2 y 1.3
   * O - grande de 1.2: O(n)
   * O - grande de 1.3: O(n)
   */
  public static void main(String[] args){
    int s,k;
    k = s = 5;
   System.out.println(esPrimo(s));
   System.out.println(esPrimo(k));
   k = 100;
   s = 10;
   System.out.println(Producto(k, s));
   System.out.println(Dividir(k,s));
  } 
}