package PalindromeNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

  @Test public void testPalindromeNumber() throws Exception {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    assertEquals(true, palindromeNumber.isPalindrome(0));
    assertEquals(false, palindromeNumber.isPalindrome(-1));
    assertEquals(true, palindromeNumber.isPalindrome(9));
    assertEquals(true, palindromeNumber.isPalindrome(11));
    assertEquals(true, palindromeNumber.isPalindrome(121));
    assertEquals(false, palindromeNumber.isPalindrome(120));
    assertEquals(false, palindromeNumber.isPalindrome(321));
    assertEquals(true, palindromeNumber.isPalindrome(101));
    assertEquals(false, palindromeNumber.isPalindrome(1000021));
    assertEquals(true, palindromeNumber.isPalindrome(1001));
    assertEquals(false, palindromeNumber.isPalindrome(Integer.MAX_VALUE));

  }
}
