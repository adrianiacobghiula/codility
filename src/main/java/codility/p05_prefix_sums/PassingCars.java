package codility.p05_prefix_sums;

/*
https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
 */
public class PassingCars {

  public static final int MAX_ALLOWED = 1_000_000_000;

  // https://app.codility.com/demo/results/trainingWW3KYV-98V/
  int solution(int[] a) {
    int east = 0;
    int passingCars = 0;
    for (int value : a) {
      if (value == 0) {
        east++;
      }
      if (value == 1) {
        passingCars += east;
      }
      if (passingCars > MAX_ALLOWED) {
        break;
      }
    }
    return (passingCars > MAX_ALLOWED) ? -1 : passingCars;
  }
}
