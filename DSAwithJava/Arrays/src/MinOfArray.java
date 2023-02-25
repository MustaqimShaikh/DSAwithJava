import java.util.Scanner;

public class MinOfArray {

  //Write a program to find min of arrays.

  public static void main(String[] args) {
    {

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter size of Arrays elements: ");
      int elementCount = scanner.nextInt();
      int element[] = new int[elementCount];
      for (int e = 0; e < elementCount; e++) {
        System.out.printf("Enter Arrays elements number %s : ", e + 1);
        element[e] = scanner.nextInt();
      }

      //Main logic
      int max = element[1];
      for (int i = 0; i <element.length; i++) {
        if (max > element[i]) {
          max = element[i];
        }
      }
      System.out.printf("Max element is : %s", max);
    }
  }
}
