package DecodeString;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * #394. Decode String
 */
public class DecodeString {

  public String decodeString(String s) {
    if ("".equals(s)) {
      return "";
    }

    Stack<Integer> repertStack = new Stack<>();
    Stack<String> strStack = new Stack<>();
    char[] chars = s.toCharArray();
    StringBuilder repeatNum = new StringBuilder();
    for (char str : chars) {
      if (Character.isDigit(str)) {
        repeatNum.append(str);
      } else {
        if (repeatNum.length() != 0) {
          repertStack.add(Integer.parseInt(repeatNum.toString()));
        }

        if (str == ']') {
          List<String> needRepeatStr = new ArrayList<>();
          String poped = "";
          do {
            if(!poped.equals("")){
              needRepeatStr.add(poped);
            }

            poped = strStack.pop();

          } while (!poped.equals("["));
          StringBuilder rs = new StringBuilder();
          for (int i = needRepeatStr.size() - 1; i >= 0; i--) {
            rs.append(needRepeatStr.get(i));
          }
          int loopCount = repertStack.pop();
          StringBuilder rs1 = new StringBuilder();
          while (loopCount != 0) {
            rs1.append(rs);
            loopCount--;
          }
          strStack.add(rs1.toString());

        } else {
          strStack.add(String.valueOf(str));
        }

        repeatNum = new StringBuilder();
      }
    }
    List<String> poped = new ArrayList<>();
    while (!strStack.isEmpty()) {
      poped.add(strStack.pop());
    }
    StringBuilder rs = new StringBuilder();
    for (int i = poped.size() - 1; i >= 0; i--) {
      rs.append(poped.get(i));
    }
    return rs.toString();
  }
}
