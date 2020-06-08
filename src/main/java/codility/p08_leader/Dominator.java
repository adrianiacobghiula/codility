package codility.p08_leader;

/*
https://app.codility.com/programmers/lessons/8-leader/dominator/
 */
public class Dominator {
  // https://app.codility.com/demo/results/training74C9D8-YBY/
  public int solution(int[] A) {
    Integer leader = null;
    int leaderCnt = 0;
    int leaderPosition = -1;
    for (int i = 0; i < A.length; i++) {

      if (leaderCnt == 0) {
        leaderPosition = i;
        leader = A[i];
        leaderCnt++;
      } else {
        if (leader == A[i]) {
          leaderCnt++;
        } else {
          leaderCnt--;
        }
      }
    }
    if (leaderCnt == 0)
      return -1;
    leaderCnt = 0;

    for (int value : A) {
      if (leader == value) {
        leaderCnt++;
      }
    }
    if (leaderCnt > A.length / 2) {
      return leaderPosition;
    }
    return -1;
  }
}
