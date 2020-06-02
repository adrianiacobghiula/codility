package codility.p01_iterations;
/*
https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
https://app.codility.com/demo/results/trainingAWAYEM-NXV/
 */
public class BinaryGap {

  public int solution(int n) {
    int currentPosition = 0;
    int last1Position = -1;
    int maxGap = 0;
    while (n > 0) {

      if ((n & 1) == 1) {
        if (last1Position >= 0) {
          maxGap = Math.max(maxGap, currentPosition - last1Position - 1);
        }

        last1Position = currentPosition;
      }
      n = n >> 1;
      currentPosition++;
    }
    return maxGap;
  }
}
