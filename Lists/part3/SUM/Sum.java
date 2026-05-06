import java.util.ArrayList;

public class Sum {

  public static void main(String[] args) {

    ArrayList<Integer> lista = new ArrayList<>();

    lista.add(10);
    lista.add(20);
    lista.add(30);
    lista.add(40);

    sum(lista);
    System.out.println(sum(lista));

    lista.add(20);
    lista.add(30);

    System.out.println(sum(lista));

  }

  /*
   * Create the method public static int sum(ArrayList<Integer> numbers)
   * in the exercise template. The method is to return the sum of the numbers in
   * the parameter list.
   */

  public static int sum(ArrayList<Integer> numbers) {
    int res = 0;
    for (Integer recorre : numbers) {
      res += recorre;
    }
    return res;
  }
}
