
public class SizeArray {
  public static void main(String[] args) {
    int[] numeros = new int[5];

    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;

    System.out.println("hay " + numeros.length + " elementos: ");

    int index = 0;
    while (index < numeros.length) {
      System.out.println(numeros[index]);
      index++;
    }

  }
}

// hola pijes
