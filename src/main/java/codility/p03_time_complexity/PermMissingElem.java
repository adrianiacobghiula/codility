package codility.p03_time_complexity;

import java.util.Arrays;

/*
https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
public class PermMissingElem {

  /*
  https://app.codility.com/demo/results/trainingGEKTXD-CTH/
  medium1 & medium 2 fail -> the stream looks slow
   */
  public int solution(int[] a) {
    long elemSum = Arrays.stream(a).mapToLong(t -> (long) t).sum();
    long upToNumber = a.length + 1;
    long sumOfFirstNumbers = (upToNumber) * (upToNumber + 1) / 2;
    return (int) (sumOfFirstNumbers - elemSum);
  }

  /*
  https://app.codility.com/demo/results/trainingWS6DV9-RHJ/
   */
  public int solution2(int[] a) {
    long elemSum = 0;
    for (int value : a) {
      elemSum += value;
    }
    long upToNumber = a.length + 1;
    long sumOfFirstNumbers = (upToNumber) * (upToNumber + 1) / 2;
    return (int) (sumOfFirstNumbers - elemSum);
  }
}
