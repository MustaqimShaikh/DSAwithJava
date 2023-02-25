import java.util.Scanner;

public class RemoveEvenNumber {

  /**
   * Write a program to remove even number of ArrayList.
   */

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of array elements : ");
    int elementCount = scanner.nextInt();
    int[] elements = new int[elementCount];
    System.out.println("Enter elements in series : ");
    for (int i = 0; i < elements.length; i++) {
      elements[i] = scanner.nextInt();
    }


    //Main logic
    for (int i = elements.length - 1; i >= 0; i--) {
      if (elements[i] % 2 ==0) {

      }
    }
  }
}
