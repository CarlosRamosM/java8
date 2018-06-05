package mx.com.training.java8.lambda.types.supplier;

import java.util.function.Supplier;

/**
 * 
 * Clase que ejemplifica de manera sencilla el uso de expresiones lambdas de
 * tipo supplier. <br/>
 * Las expresiones lambda de este tipo no tienen par&aacute;metros de entrada,
 * pero si devuelven un resultado. <br/>
 * Hacen uso de la interfaz Supplier<T>.
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
public class SupplierLambda {

  /**
   * 
   * M&eacute;todo que muestra el contenido de una cadena recibida como
   * par&aacute;metro.
   * 
   * @param cadena
   */
  public void getContenidoCadena(String cadena) {
    Supplier<String> str = () -> cadena;
    System.out.println("La cadena recibida : " + str.get());
  }
}
