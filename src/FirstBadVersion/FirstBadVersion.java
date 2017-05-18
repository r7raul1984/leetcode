package FirstBadVersion;

/**
 * #278. First Bad Version
 */
public class FirstBadVersion extends VersionControl {

  public int firstBadVersion(int n) {
    if (n == 1) {
      return n;
    }

    int mid = n >> 1;

    while (mid != 0 && mid <= n) {

      boolean bad = isBadVersion(mid);
      if (!isBadVersion(mid - 1) && bad) {
        return mid;
      }
      if (isBadVersion(mid + 1) && !bad) {
        return mid + 1;
      }
      if (bad) {//<--
        n = mid;//should update n
        mid = mid >> 1;

      } else {//-->
        int rs = (n - mid);
        mid += rs >> 1;
      }
    }
    return mid;
  }
}
