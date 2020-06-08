package codility.p08_leader;

/*
https://app.codility.com/programmers/lessons/8-leader/dominator/
 */
public class Dominator {
  // https://app.codility.com/demo/results/training74C9D8-YBY/

  public static class Leader {
    private final Integer leader;
    private final int leaderCount;
    private final int leaderPosition;

    public Leader(Integer leader, int leaderCount, int leaderPosition) {
      this.leader = leader;
      this.leaderCount = leaderCount;
      this.leaderPosition = leaderPosition;
    }

    public Integer getLeader() {
      return leader;
    }

    public int getLeaderCount() {
      return leaderCount;
    }

    public int getLeaderPosition() {
      return leaderPosition;
    }
  }

  public Leader getLeader(int[] A) {
    Integer leader = null;
    int leaderCount = 0;
    int leaderPosition = -1;
    for (int i = 0; i < A.length; i++) {

      if (leaderCount == 0) {
        leaderPosition = i;
        leader = A[i];
        leaderCount++;
      } else {
        if (leader == A[i]) {
          leaderCount++;
        } else {
          leaderCount--;
        }
      }
    }
    if (leaderCount == 0)
      return null;
    leaderCount = 0;

    for (int value : A) {
      if (leader == value) {
        leaderCount++;
      }
    }
    if (leaderCount > A.length / 2) {
      return new Leader(leader, leaderCount, leaderPosition);
    }
    return null;
  }

  public int solution(int[] A) {
    Leader leader = getLeader(A);
    return null == leader ? -1 : leader.leaderPosition;

  }
}
