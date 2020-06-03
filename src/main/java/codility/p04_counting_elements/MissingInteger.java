package codility.p04_counting_elements;

import java.util.Arrays;

/*
https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 */
public class MissingInteger {
  // https://app.codility.com/demo/results/trainingP3D4CY-D5X/
  public int solution(int[] a) {
    Arrays.sort(a);
    int missing = 1;
    int i = 0;
    while ((i < a.length) && (a[i] <= missing)) {
      if (a[i] == missing) {
        missing++;
      }
      i++;
    }

    return missing;
  }
}
