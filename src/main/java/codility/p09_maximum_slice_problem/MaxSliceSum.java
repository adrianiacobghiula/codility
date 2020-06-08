package codility.p09_maximum_slice_problem;

/*
https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
 */
public class MaxSliceSum {

  // https://app.codility.com/demo/results/training994T85-EVZ/
  public int solution(int[] A) {
    int maxSlice = A[0];
    int max = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0) {
        max = max + A[i];
        maxSlice = Math.max(max, maxSlice);
      } else {
        max = Math.max(max + A[i], 0);
        maxSlice = Math.max(A[i], maxSlice);
      }
    }

    return maxSlice;
  }

}
