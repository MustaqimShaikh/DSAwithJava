import java.util.Scanner;

public class ReverseOfArrayBySwapping {

  //Write a program to get reserves arrays. (by Swapping technique)

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter size of Arrays elements : ");
    int elementsCount = scanner.nextInt();
    int[] elements = new int[elementsCount];
    for (int e = 0; e < elementsCount; e++) {
      System.out.printf("Enter Arrays elements number %s ", e + 1);
      elements[e] = scanner.nextInt();
    }

    //Main logic
    int firstIndex = 0;
    int lastIndex = elementsCount - 1;
    while (firstIndex < lastIndex) {
//      elements[lastIndex] = elements[firstIndex]; // won't work on this way.
//      elements[firstIndex] = elements[lastIndex];
      int element = elements[firstIndex];
      elements[firstIndex] = elements[lastIndex];
      elements[lastIndex] = element;
      firstIndex++;
      lastIndex--;
    }

    //Printing reserves Arrays.
    System.out.print("Reverse Array : ");
    for (int k = 0; k < elements.length; k++) {
      System.out.print(elements[k] + " ");
    }
  }
}
