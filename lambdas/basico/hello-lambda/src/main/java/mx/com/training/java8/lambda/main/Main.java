package mx.com.training.java8.lambda.main;

import mx.com.training.java8.lambda.hello.HelloLambda;
import mx.com.training.java8.lambda.types.consumer.ConsumerLambda;
import mx.com.training.java8.lambda.types.function.FunctionLambda;
import mx.com.training.java8.lambda.types.predicate.PredicateLambda;
import mx.com.training.java8.lambda.types.supplier.SupplierLambda;

/**
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
public class Main {

  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    Main main = new Main(); 
    if (args[0].equals("HELLO")) {
      main.helloLambda();
    } else if (args[0].equals("PREDICATE")) {
      main.predicateLambda();
    } else if (args[0].equals("FUNCTION")) {
      main.functionLambda();
    } else if (args[0].equals("SUPPLIER")) {
      main.supplierLambda();
    } else if (args[0].equals("CONSUMER")) {
      main.consumerLambda();
    } else if (args[0].equals("ALL")) {
      main.helloLambda();
      main.predicateLambda();
      main.functionLambda();
      main.supplierLambda();
      main.consumerLambda();
    }
  }
  
  /**
   * 
   */
  protected void helloLambda() {
    HelloLambda helloLambda = new HelloLambda();
    helloLambda.sayHelloLambda();
  }
  
  /**
   * 
   */
  protected void predicateLambda() {
    PredicateLambda predicate = new PredicateLambda();
    predicate.evaluaLongitudString();
    predicate.muestraValoresMayoresCinco();
  }
  
  /**
   * 
   */
  protected void functionLambda() {
    FunctionLambda function = new FunctionLambda();
    String cadena = "Lambdas tipo function";
    function.sumaValores(5, 5);
    function.tamanioString(cadena);
  }
  
  /**
   * 
   */
  protected void supplierLambda() {
    SupplierLambda supplier = new SupplierLambda();
    supplier.getContenidoCadena("Ejemplo de lambda de tipo supplier");
  }
  
  /**
   * 
   */
  protected void consumerLambda() {
    ConsumerLambda consumer = new ConsumerLambda();
    consumer.getInfoFromArg("Consumer!!!");
  }
}