import java.util.ArrayList;

public class PrintInRange {

  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(2);
    lista.add(6);
    lista.add(-1);
    lista.add(5);
    lista.add(7);
    lista.add(1);

    System.out.println("The numbers in the range [0, 5]");
    printNumbersInRange(lista, 0, 5);
    System.out.println("The numbers in the range [3, 10]");
    printNumbersInRange(lista, 3, 10);

  }

  public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
    // entonces tenemos que hacer un metodo que nos imprima el intervalo cerrado de
    // enteros positivos.

    // el numero tiene que ser mayor o igual a lowerLimit y menor o igual a
    // upperLimit
    for (Integer recorre : numbers) {
      if (recorre >= lowerLimit && recorre <= upperLimit) {
        System.out.println(recorre);
      }
    }
  }

}
