package mx.com.training.java8.lambda.types.consumer;

import java.util.function.Consumer;

/**
 * 
 * Clase que ejemplifica de manera sencilla el uso de expresiones lambdas de
 * tipo consumer. <br/>
 * Las expresiones lambda de este tipo tienen un solo par&aacute;metro de
 * entrada, y no devuelven ning&uacute;n resultado. <br/>
 * Hacen uso de la interfaz Consumer<T>.
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
public class ConsumerLambda {

  /**
   * 
   * M&eacute;todo que imprime en consola el contenido de la cadena que se recibe
   * como par&aacute;metro.
   * 
   * @param cadena
   */
  public void getInfoFromArg(String cadena) {
    Consumer<String> str = (string) -> System.out.println("Cadena: " + cadena);
    str.accept(cadena);
  }
}
