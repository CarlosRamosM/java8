package mx.com.training.java8.lambda.types.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * Clase que ejemplifica de manera simple el uso de expresiones lambdas de tipo
 * predicado. <br/>
 * Los predicados son expresiones que reciben un argumento y devuelven un valor
 * l&oacute;gico. <br/>
 * Se utiliza la interfaz Predicate<T>.
 * 
 * @author carlos.ramos
 * @version 1.0
 * @since 2018-05-21
 *
 */
public class PredicateLambda {

  /**
   * Evalua que la longitud de una palabra sea mayor a Zero, haciendo uso de
   * expresi&oacute;n lambda con la interfaz Predicate<T>
   */
  public void evaluaLongitudString() {
    String word = "Predicado";
    Predicate<String> predicate = (s) -> s.length() > 0;
    System.out.println("La palabra " + "'" + word + "'" + " es mayor a zero? " + predicate.test(word));
  }

  /**
   * M&eacute;todo el cual a partir de una lista de numeros evalua lo siguiente.
   * <br/>
   * <ul>
   * <li>Numeros pares.
   * <li>Numeros impares.
   * <li>Numeros mayores a 5.
   * <ul/>
   * <br/>
   * Para realizar la evaluaci&oacute;n de la lista de numeros, usa una
   * expresi&oacute;n lambda que usa la interfaz Predicate<T>.
   */
  public void muestraValoresMayoresCinco() {
    List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("Números pares: ");
    evaluar(numerosList, (n) -> n % 2 == 0);
    System.out.println("Números impares: ");
    evaluar(numerosList, (n) -> n % 2 == 1);
    System.out.println("Numeros mayores a 5: ");
    evaluar(numerosList, (n) -> n > 5);
  }

  /**
   * 
   * M&eacute;todo encargado de revisar que la expresi&oacute;n recibida como
   * par&aacute;metro sea verdadera, e imprime en consola los valores que
   * cumplan con la validaci&oacute;n.
   * 
   * @param numeroList
   * @param predicado
   */
  protected static void evaluar(List<Integer> numeroList, Predicate<Integer> predicado) {
    System.out.println("*********************************");
    for (Integer n : numeroList) {
      if (predicado.test(n)) {
        System.out.println(n + " ");
      }
    }
    System.out.println();
  }
}
