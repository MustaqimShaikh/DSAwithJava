import java.util.Scanner;

public class BubbleSort {

  /**
   *Write a program to sort array by Bubble Sort.
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
    for (int i = 0; i < element.length - 1; i++) { //element.length - 1 'because the last element placed automatically'
      for (int j = 0; j < element.length - 1 - i; j++) {
        if (element[j] > element[j+1]) {
          int temp = element[j];
          element[j] = element[j+1];
          element[j+1] = temp;
        }
      }
      System.out.printf("Iteration no. %s : ", i);
      for (int a : element) {
        System.out.print(a  + " ");
      }
      System.out.println();
    }

    System.out.println("Complete sorted arrays : ");
    for (int a : element) {
      System.out.print(a  + " ");
    }
  }
}
