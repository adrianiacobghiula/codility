package codility.p06_sorting;

import java.util.Arrays;

/*
https://app.codility.com/programmers/lessons/6-sorting/triangle/
 */
public class Triangle {
  // https://app.codility.com/demo/results/trainingFAV9GH-BQJ/
  public int solution(int[] a) {
    Arrays.sort(a);
    for (int p = 0; p < a.length - 2; p++) {
      int q = p + 1;
      int r = p + 2;
      if (((long) a[p] + (long) a[q] > a[r]) &&
          ((long) a[q] + (long) a[r] > a[p]) &&
          (long) a[r] + (long) a[p] > a[q]) {
        return 1;
      }
    }
    return 0;
  }
}
