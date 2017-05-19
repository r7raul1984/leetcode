package ReverseString;

/**
 * 344. Reverse String
 */
public class ReverseString {

  public String reverseString(String s) {
    if (s.length() == 0) {
      return "";
    }
    char[] chars = s.toCharArray();
    StringBuilder result = new StringBuilder();
    for (int i = chars.length - 1; i >= 0; i--) {
      result.append(chars[i]);
    }
    return result.toString();
  }
}
