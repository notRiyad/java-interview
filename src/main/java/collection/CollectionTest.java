
package collection;

import java.util.List;
import java.util.stream.Collectors;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) 
  {
    return input.stream()
                .map(x -> power((x * 2) + 3, 5))
                .collect(Collectors.toList());
  }

  private static double power(int base, int exponent) 
  {
    double result = 1;
    for (int i = 0; i < exponent; i++) 
    {
      result *= base;
    }
    return result;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) 
  {
    return input.stream()
                .map(s -> {
                  if (s.isEmpty()) return "";
                  String capitalized = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
                  return capitalized + capitalized;
                })
                .collect(Collectors.toList());
  }
}
