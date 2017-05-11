package HappyNumber;

import java.util.HashSet;
import java.util.Set;

//#202
public class HappyNumber {

  public boolean isHappy(int n) {
    if (n == 1) {
      return true;
    }
    if (n <= 0) {
      return false;
    }
    int sum;
    int number = n;
    Set<Integer> existRs = new HashSet<>();
    do {
      sum = 0;
      while (number != 0) {
        sum += Math.pow(number % 10, 2);
        number /= 10;
      }
      if (existRs.contains(sum)) {
        return false;
      } else {
        existRs.add(sum);
      }
      number = sum;
    } while (number != 1);

    return true;
  }
}
