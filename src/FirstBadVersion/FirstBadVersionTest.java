package FirstBadVersion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

  @Test public void testFirstBadVersion() throws Exception {
    FirstBadVersion firstBadVersion = new FirstBadVersion();
    assertEquals(1702766719, firstBadVersion.firstBadVersion(2126753390));
   // assertEquals(1, firstBadVersion.firstBadVersion(2));
  }
}
