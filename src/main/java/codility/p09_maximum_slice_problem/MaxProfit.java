package codility.p09_maximum_slice_problem;

/*
https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
 */
public class MaxProfit {

  // https://app.codility.com/demo/results/trainingYJVWX2-A6J/
  public int solution(int[] A) {
    int maxSlice = 0;
    int max = 0;
    for (int i = 1; i < A.length; i++) {
      max = Math.max(max + A[i] - A[i - 1], 0);
      maxSlice = Math.max(max, maxSlice);
    }

    return maxSlice;
  }
}
