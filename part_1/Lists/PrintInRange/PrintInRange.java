import java.util.ArrayList;

public class PrintInRange {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(2);
    numbers.add(6);
    numbers.add(-1);
    numbers.add(5);
    numbers.add(1);

    System.out.println("The numbers in the range [0, 5]");
    printNumbersInRange(numbers, 0, 5);

    System.out.println("The numbers in the range [3, 10]");
    printNumbersInRange(numbers, 3, 10);
  }

  public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

    // tenemos que recorrer los elementos de la lista dependiendo del rango que se
    // nos de

    for (Integer recorre : numbers) {
      if (recorre >= lowerLimit && recorre <= upperLimit) {
        System.out.println(recorre);
      }
    }
  }
}
