package codility.p03_time_complexity;

/*
https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
public class TapeEquilibrium {

  /*
  https://app.codility.com/demo/results/training2QRQ7D-TBR/
   */
  public int solution(int[] A) {
    long sum = 0;
    for (int value : A) sum += value;

    long firstSum = A[0];
    long secondSum = sum - A[0];
    long minDifference = Math.abs(secondSum - firstSum);
    for (int p = 1; p < A.length - 1; p++) {
      firstSum += A[p];
      secondSum -= A[p];
      minDifference = Math.min(minDifference, Math.abs(secondSum - firstSum));
    }
    return (int) minDifference;
  }
}
