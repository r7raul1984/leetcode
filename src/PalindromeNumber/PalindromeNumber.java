package PalindromeNumber;

//#9 PalindromeNumber
public class PalindromeNumber {

  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    if (x < 10) {
      return true;
    }
    int y = 0;
    int loopcount = 0;
    int num1 = x;
    while (num1 != 0) {
      loopcount++;
      num1 /= 10;
      if (y == 0) {
        y++;
      } else {
        y *= 10;
      }
    }
    loopcount /= 2;
    int num = x;
    do {
      int left = (x / y) % 10;
      int right = num % 10;
      if (left != right) {
        return false;
      }
      y /= 10;
      num /= 10;
      loopcount--;
    } while (loopcount > 0);
    return true;
  }
}
