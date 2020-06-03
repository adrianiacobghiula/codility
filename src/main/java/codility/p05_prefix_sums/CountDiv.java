package codility.p05_prefix_sums;

/*
https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 */
public class CountDiv {

  //https://app.codility.com/demo/results/trainingB638FD-KB8/
  public int solution(int a, int b, int k) {
    int nextDivisibleAfterA = a % k == 0 ? a : a + (k - a % k);
    if (nextDivisibleAfterA > b) {
      return 0;
    }
    return (b - nextDivisibleAfterA) / k + 1;
  }
}
