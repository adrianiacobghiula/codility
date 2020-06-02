package codility.p04_counting_elements;

/*
https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
 */
public class MaxCounters {

  // https://app.codility.com/demo/results/trainingNJCHY2-6RV/
  public int[] solution(int n, int[] a) {
    int[] sum = new int[n];
    int maxCounter = 0;
    int currentMaxCounter = 0;
    for (int i = 0; i < a.length; i++) {
      int x = a[i] - 1;
      if (0 <= x && x < n) {
        sum[x] = Math.max(currentMaxCounter, sum[x]) + 1;
        maxCounter = Math.max(sum[x], maxCounter);
      } else if (x == n) {
        currentMaxCounter = maxCounter;
      }
    }
    for (int j = 0; j < n; j++) {
      sum[j] = Math.max(sum[j], currentMaxCounter);
    }
    return sum;
  }
}
