package HammingWeight;

//#191. Number of 1 Bits
public class HammingWeight {

  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int result = 0;
    String nstr = Integer.toBinaryString(n);
    char[] nchar = nstr.toCharArray();
    for (int i = 0; i < nchar.length; i++) {
      char numChar = nchar[i];
      char[] charArray = {numChar};
      int intNum = Integer.parseInt(new String(charArray));
      result += intNum;
    }
    return result;
  }
}
