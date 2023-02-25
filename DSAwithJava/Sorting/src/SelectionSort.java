import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SelectionSort {

  /**
   * Write a program to sort array by Selection Sort.
   */

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter size of Arrays elements: ");
    int elementCount = scanner.nextInt();
    int element[] = new int[elementCount];
    System.out.print("Enter arrays elements : ");
    for (int e = 0; e < elementCount; e++) {
      element[e] = scanner.nextInt();
    }


    for (int i = 0; i < element.length; i++) {
      int minValue = element[i];
      int index = i;
      for (int j = i + 1; j < element.length; j++) {
        if (element[j] < minValue) {
          minValue = element[j];
          index = j;
        }

      }

      int temp = element[i];
      element[i] = element[index];
      element[index] = temp;
      System.out.printf("Iteration no : %s :  ", i);
      for (int a : element) {
        System.out.print(a + " ");
      }
      System.out.println();
    }
    System.out.println();
    System.out.print("Complete Sorted Arrays : ");
    for (int a : element) {
      System.out.print(a + " ");
    }
  }
}
