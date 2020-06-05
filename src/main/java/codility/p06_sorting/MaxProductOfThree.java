package codility.p06_sorting;

import java.util.Arrays;

/*
https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 */
public class MaxProductOfThree {

  //https://app.codility.com/demo/results/trainingCEYWMM-T3Y/
  int solution(int[] a) {
    Arrays.sort(a);
    int n = a.length;
    int firstNeg = a[0] * a[1] * a[n - 1];
    int lastPoz = a[n - 3] * a[n - 2] * a[n - 1];
    return Math.max(firstNeg, lastPoz);
  }

}
