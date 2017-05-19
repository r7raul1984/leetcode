package ReverseStringII;


/**
 * 541. Reverse String II
 *
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 */
public class ReverseStringII {

  public String reverseStr(String s, int k) {
   /* if (s.length() == 1) {
      return s;
    }
    String result = "";
    Stack<String> stack = new Stack<>();
    char[] chars = s.toCharArray();
    int remain = chars.length;
    for (int i = 0; i < chars.length; i++) {
      int j = i + 1;
      if (remain >= k && remain < 2 * k) {
        int start = i;
        int count = 1;
        while (count <= k) {
          stack.add(String.valueOf(chars[start]));
          count++;
          start++;
        }
        String temp = "";
        while (!stack.isEmpty()) {
          temp += stack.pop();
        }
        result += temp;
        for (int x = start; x < chars.length; x++) {
          result += chars[x];
        }
        return result;
      } else if (j % (2 * k) == 0) {
        int count = 1;
        for (int m = j - 2 * k; m < j; m++) {
          if (count > k) {
            String temp = "";
            while (!stack.isEmpty()) {
              temp += stack.pop();
            }
            result += temp;
            result += chars[m];
          } else if (count <= k) {
            stack.push(String.valueOf(chars[m]));
          }

          count++;
        }
        remain = remain - 2 * k;
      }
    }
    if (remain > 0) {
      for (int i = chars.length - remain; i < chars.length; i++) {
        result += chars[i];
      }
    }*/

    if (s.length() <= k) {
      StringBuffer sb = new StringBuffer(s);
      return sb.reverse().toString();
    } else if(s.length() <= 2 * k){
      StringBuffer sb = new StringBuffer(s.substring(0, k));
      return sb.reverse().toString() + s.substring(k);
    }
    return reverseStr(s.substring(0, 2 * k), k) + reverseStr(s.substring(2 * k), k);
  }
}
