package mx.com.training.java8.lambda.types.function;

import java.util.function.Function;

/**
 * 
 * Clase que ejemplifica de manera simple el uso de expresiones lambdas de tipo
 * funciones. <br/>
 * Las funciones reciben un argumento y devuelven un resultado. <br/>
 * Se utiliza la interfaz Function<T, R>.
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
public class FunctionLambda {

  /**
   * 
   * M&eacute;todo que realiza la suma de los par&aacute;metros recibidos,
   * haciendo uso de una expresi&oacute;n lambda de tipo <b>function<b/>.
   * 
   * @param a
   * @param b
   */
  public void sumaValores(int a, int b) {
    Function<Integer, Integer> suma = x -> x + 5;
    System.out.println("La suma de " + a + " + " + b + " es: " + suma.apply(5));
  }

  /**
   * 
   * M&eacute;todo que obtiene el tamaño de la cadena que se recibe como
   * par&aacute;metro.
   * 
   * @param cadena
   */
  public void tamanioString(String cadena) {
    Function<String, Integer> tamanioCadena = str -> str.length();
    System.out.println("El tamaño de la cadena es " + tamanioCadena.apply(cadena));
  }
}
