package AddDigits;

//#258
public class AddDigits {

  public int addDigits(int num) {
    int result;
    result = (int) (num - 9 * Math.floor((num - 1) / 9));
    return result;
  }
}
