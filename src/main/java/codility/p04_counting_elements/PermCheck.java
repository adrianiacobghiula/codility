package codility.p04_counting_elements;

import java.util.Arrays;

/*
https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
 */
public class PermCheck {
  //https://app.codility.com/demo/results/trainingERTVB8-SXV/
  public int solutionMoreComputing(int[] a) {
    Arrays.sort(a);
    int i = 0;
    while (i < a.length && a[i] == i + 1) {
      i++;
    }
    return i < a.length ? 0 : 1;
  }

  //https://app.codility.com/demo/results/training2DVHSB-W23/
  public int solutionMoreMemory(int[] a) {
    boolean[] filledPositionArr = new boolean[a.length];
    for (int value : a) {
      if ((value <= 0) || (value > a.length))
        return 0;
      int filledPosition = value - 1;
      if (filledPositionArr[filledPosition])
        return 0;
      filledPositionArr[filledPosition] = true;
    }
    return 1;
  }
}
