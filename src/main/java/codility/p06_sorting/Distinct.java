package codility.p06_sorting;

import java.util.Arrays;

/*
https://app.codility.com/programmers/lessons/6-sorting/distinct/
*/

public class Distinct {

  // https://app.codility.com/demo/results/trainingY5455Q-FVH/
  public int solution(int[] a) {
    if (a.length == 0) {
      return 0;
    }
    Arrays.sort(a);
    int distinct = 1;
    int previousValue = a[0];
    for (int value : a) {
      if (value != previousValue) {
        distinct++;
        previousValue = value;
      }
    }
    return distinct;
  }

  //https://app.codility.com/demo/results/trainingMJ8AUQ-6XQ/
  //a little slower that old fashion
  public int solutionStreams(int[] a) {
    return (int) Arrays.stream(a)
        .distinct()
        .count();
  }

}
