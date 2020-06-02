package codility.p04_counting_elements;

/*
https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
public class FrogRiverOne {

  /*
  https://app.codility.com/demo/results/trainingSSB742-HDY/
   */
  public int solution(int X, int[] A) {
    boolean[] filledPositionArr = new boolean[X];
    int filledPositionsCount = X;
    for (int i = 0; i < A.length; i++) {
      int filledPosition = A[i] - 1;
      if (!filledPositionArr[filledPosition]) {
        filledPositionArr[filledPosition] = true;
        filledPositionsCount--;
        if (filledPositionsCount == 0)
          return i;
      }
    }
    return -1;
  }
}
