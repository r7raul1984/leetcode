package ReverseWordsinaString;

import java.util.Stack;

/**
 * 151. Reverse Words in a String
 */
public class ReverseWordsinaString {

  public String reverseWords(String s) {
    String trimed = s.trim();
    Stack<String> stack = new Stack<>();
    trimed += " ";
    char[] chars = trimed.toCharArray();
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < chars.length; i++) {
      char rs = chars[i];
      if (Character.isWhitespace(rs)) {
        if (str.length() > 0) {
          stack.push(str.toString());
          str = new StringBuilder();
        }

        continue;
      }
      str.append(rs);

    }
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
      result.append(stack.pop()).append(" ");
    }
    return result.toString().trim();
  }
}
