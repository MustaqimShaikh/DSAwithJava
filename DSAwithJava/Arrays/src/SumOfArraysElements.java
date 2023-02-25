import java.util.Scanner;

public class SumOfArraysElements {

  //write a program to get sum of all arrays elements.

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of Arrays elements: ");
    int elementCount = scanner.nextInt();
    int[] element = new int[elementCount];
    for (int e = 0; e < elementCount; e++) {
      System.out.printf("Enter Arrays elements number %s : %n", e + 1);
      element[e] = scanner.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < element.length; i++) {
      sum = element[i] + sum;
    }
    System.out.println("Sum fo elements : " + sum);

  }
} 
