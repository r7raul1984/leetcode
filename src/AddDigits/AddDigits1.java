package AddDigits;


public class AddDigits1 {

  public int addDigits(int num) {
    if (num < 10) {
      return num;
    }
    char[] digits = String.valueOf(num).toCharArray();
    int result = 0;
    for (int i = 0; i < digits.length; i++) {
      char numChar = digits[i];
      char[] charArray = {numChar};
      int intNum = Integer.parseInt(new String(charArray));
      result += intNum;
    }
    return addDigits(result);
  }
}
