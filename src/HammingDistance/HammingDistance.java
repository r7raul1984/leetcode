package HammingDistance;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {

  public static void main(String[] args) {

  }

  public int hammingDistance(int x, int y) {
    int result = 0;
    List<Integer> binx = covertToBin(x);
    List<Integer> biny = covertToBin(y);

    if (binx.size() == biny.size()) {
      for (int i = 0; i < binx.size(); i++) {
        if (!binx.get(i).equals(biny.get(i))) {
          result++;
        }
      }
    } else if (binx.size() > biny.size()) {
      for (int i = 0; i < biny.size(); i++) {
        if (!binx.get(i).equals(biny.get(i))) {
          result++;
        }
      }
      for (int i = biny.size(); i < binx.size(); i++) {
        int bit = binx.get(i);
        if (bit != 0) {
          result += bit;
        }
      }
    } else {
      for (int i = 0; i < binx.size(); i++) {
        if (!binx.get(i).equals(biny.get(i))) {
          result++;
        }
      }
      for (int i = binx.size(); i < biny.size(); i++) {
        int bit = biny.get(i);
        if (bit != 0) {
          result += bit;
        }
      }
    }
    return result;
  }

  public List<Integer> covertToBin(int y) {
    List<Integer> binList = new ArrayList<>();
    if (y == 0) {
      binList.add(0);
      return binList;
    }
    int next = y;
    int remain;
    do {
      int b = next / 2;
      remain = next - 2 * b;
      binList.add(remain);
      next = b;
    } while (next > 0);
    return binList;
  }
}
