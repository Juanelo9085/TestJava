package testjava;

/**
 *
 * @author Juanelo
 */
public class TestJava {

  //Ciclo que imprime los números del 0 al 1000 salteados de 5 en 5.
  public String numerosCincoEnCinco() {
    String resultado = "";
    for (int i = 0; i <= 1000; i = i + 5) {
      resultado = resultado + i + "\n";
    }
    return resultado;
  }

  //Ciclo que imprime los números del 1000 al 0 salteados de 10 en 10.
  public String numerosDiezEnDiez() {
    String resultado = "";
    for (int i = 1000; i >= 0; i = i - 10) {
      resultado = resultado + i + "\n";
    }
    return resultado;
  }

  //Pedir nombre de usuario e imprimir solo las vocales.
  public String imprimirVocales(String usuario) {
    String resultado = "";
    char x = ' ';
    for (int i = 0; i < usuario.length(); i++) {
      x = usuario.charAt(i);
      if (x == 'a'
              || x == 'e'
              || x == 'i'
              || x == 'o'
              || x == 'u'
              || x == 'A'
              || x == 'E'
              || x == 'I'
              || x == 'O'
              || x == 'U') {
        resultado = resultado + x + ", ";
      }
    }
    return "Usuario ingresado: " + usuario + "\nImprimiendo vocales: " + resultado;
  }

  //Imprimir los primeros 50 dígitos de la serie Fibonacci
  public String secuenciaFibonacci() {
    String resultado = "";
    int aux1 = 1;
    int aux2 = 0;
    int suma = 0;
    while(aux1<50){
      aux2 = suma;
      suma = aux1 + suma;
      aux1 = aux2;
      resultado = resultado + aux1 + "\n";
    }
    return resultado;
  }

  public static void main(String[] args) {
    TestJava test = new TestJava();
    System.out.println(test.secuenciaFibonacci());
    //System.out.println(test.imprimirVocales("juanelo"));
    
  }

}
