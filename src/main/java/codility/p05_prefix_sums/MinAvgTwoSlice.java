package codility.p05_prefix_sums;

/*
https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
 */
public class MinAvgTwoSlice {

  //https://app.codility.com/demo/results/training2QFURF-GHG/
  public int solution(int[] a) {
    int minAvgPos = 0;
    double avg = (a[0] + a[1]) / 2d;
    for (int i = 0; i < a.length - 1; i++) {
      double avg2 = (a[i] + a[i + 1]) / 2d;
      if (avg > avg2) {
        avg = avg2;
        minAvgPos = i;
      }
      if (i + 2 < a.length) {
        double avg3 = (a[i] + a[i + 1] + a[i + 2]) / 3d;
        if (avg > avg3) {
          avg = avg3;
          minAvgPos = i;
        }
      }
    }
    return minAvgPos;
  }

}
