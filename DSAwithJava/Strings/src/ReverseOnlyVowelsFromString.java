public class ReverseOnlyVowelsFromString {

  /**
   * Write a program to reverse only vowels in string.
   *
   * Sample Input : youcantoit.
   * Sample Output : yiocantuot
   */

  public static void main(String[] args) {

    String s = "youcantoit";
    reverseString(s);
  }

  public static void reverseString(String s) {
    char[] chars = s.toCharArray();
    int i = 0;
    int j = chars.length - 1;
    while (i < j) {
      while (chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u') {
        i++;
      }

      while (chars[j] != 'a' && chars[j] != 'e' && chars[j] != 'i' && chars[j] != 'o' && chars[j] != 'u') {
        j--;
      }

      if (i >= j) {
        break;
      }

      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;

      i++;
      j--;

    }

    System.out.print("Reverser vowels String : ");
    for (int c = 0; c < chars.length; c++) {
      System.out.print(chars[c]);
    }
  }
}
