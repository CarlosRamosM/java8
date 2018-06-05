package mx.com.training.java8.lambda.hello;

/**
 * Clase Hello World Lambda!!!
 * 
 * Primer acercamiento al uso de las expresiones lambdas en java 8, haciendo uso
 * de una de las caracteristicas de esta nueva version de java, las interfaces
 * funcionales.
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
public class HelloLambda {

  public void sayHelloLambda() {
    HelloService helloService = (String firstName, String lastName) -> {
      String hello = "Hello " + firstName + " " + lastName;
      return hello;
    };
    System.out.println(helloService.hello("Carlos", "Ramos"));
  }
}
