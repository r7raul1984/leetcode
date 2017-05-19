package ReverseWordsinaStringIII;

import java.util.Stack;

/**
 * 557. Reverse Words in a String III
 */
public class ReverseWordsinaStringIII {

  public String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    char[] chars = (s + " ").toCharArray();
    Stack<String> stack = new Stack<>();
    for (char c : chars) {
      if (!Character.isWhitespace(c)) {
        stack.push(String.valueOf(c));
      } else {
        while (!stack.isEmpty()) {
          result.append(stack.pop());
        }
        result.append(" ");
      }

    }
    return result.toString().trim();
  }
}
