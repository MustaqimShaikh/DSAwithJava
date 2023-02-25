import java.util.Scanner;

public class SubarraysOfArray {

  /**
   *  //Write a program to get subarrays of Arrays
   *  ex.
   *  Sample input {1,2,3,4}
   *  Sample output {1}, {1, 2}, {1,2,3}, {1,2,3,4}, {2,3}, {3,4}, {3,4}, {4},
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of Arrays elements : ");
    int elementsCount = scanner.nextInt();
    int[] elements = new int[elementsCount];
    System.out.println("Enter array's elements : ");
    for (int e = 0; e < elementsCount; e++) {
      elements[e] = scanner.nextInt();
    }

    //Main Logic
    for (int si = 0; si < elements.length; si++) {
      for (int ei = si; ei < elements.length; ei++) {
        for (int k = si; k<=ei; k++) {
          System.out.print(elements[k] + " ");
        }
        System.out.println();
      }
    }
  }
}
