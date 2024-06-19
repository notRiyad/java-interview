package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * also return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i == null || n == null || i < 0 || n < 0) 
    {
      return Option.none();
    }
    try {
      if (n == 0) 
      {
        return Option.of(1);
      }
      if (i == 0) 
      {
        return Option.of(0);
      }
      int result = 1;
      for (int j = 0; j < n; j++) 
      {
        result = safeMultiply(result, i);
        if (result == Integer.MAX_VALUE) 
        {
          return Option.none();
        }
      }
      return Option.of(result);
    } catch (Exception e) {
      return Option.none();
    }
  }

  private static int safeMultiply(int a, int b) 
  {
    long result = (long) a * b;
    if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) 
    {
      return Integer.MAX_VALUE;
    }
    return (int) result;
  }
}
