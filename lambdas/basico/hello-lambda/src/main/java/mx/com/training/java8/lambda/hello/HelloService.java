package mx.com.training.java8.lambda.hello;

/**
 * Interfaz funcional para su implementacion con expresion lambda. <br/>
 * En el ejemplo HelloLambda se implementa el unico metodo hello.
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
@FunctionalInterface
public interface HelloService {

  /**
   * M&eacute;todo que implementa un saludo a las expresiones lambdas.
   * 
   * @param firstName
   * @param lastName
   * @return
   */
  String hello(String firstName, String lastName);
}
