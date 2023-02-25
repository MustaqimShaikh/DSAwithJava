import java.util.Scanner;

public class InsertionSort {

  /**
   * Write a program to sort a array by Insertion Sort.
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

    //Main logic
    for (int i = 1; i < element.length; i++) {
        int key = element[i];

        int j = i - 1;
        while (j >= 0 && element[j] > key) {
          element[j+1] = element[j] ;
          j--;
        }
      element[j+1] = key;
      System.out.println(key);
      System.out.printf("Iteration no. %s : ", i);
        for (int a : element) {
          System.out.print(a + " ");
        }
      System.out.println();
    }
    System.out.print("Complete Sorted : ");
    for (int a : element) {
      System.out.print(a + " ");
    }
  }
}
