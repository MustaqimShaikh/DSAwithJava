import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ReverseOfArray {

  //Write a program to reverse arrays.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of Arrays elements : ");
    int elementCount = scanner.nextInt();
    int[] element = new int[elementCount];
    for (int e = 0; e < elementCount; e++) {
      System.out.println("Enter Arrays elements number 1 : ");
      element[e] = scanner.nextInt();
    }

    //Main logic
    int reserveArray[] = new int[elementCount];
    int length = element.length;
    for (int i = 0; i < length; i++) {
      int j = element[length - i];
      reserveArray[i] = j;
    }
    System.out.printf("Reverse Arrays %s : ", reserveArray);
  }
}
