package codility.p04_counting_elements;

import java.util.Arrays;
/*
https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
 */
public class PermCheck {
  //https://app.codility.com/demo/results/trainingERTVB8-SXV/
  public int solution(int[] a) {
    Arrays.sort(a);
    int i = 0;
    while (i < a.length && a[i] == i + 1) {
      i++;
    }
    return i < a.length ? 0 : 1;
  }
}
