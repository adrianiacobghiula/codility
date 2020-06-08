package codility.p08_leader;

/*
https://app.codility.com/programmers/lessons/8-leader/equi_leader/
 */
public class EquiLeader {

  // https://app.codility.com/demo/results/trainingP3KUVX-TYH/
  public int solution(int[] A) {
    Dominator.Leader leader = new Dominator().getLeader(A);
    if (null == leader) {
      return 0;
    }

    int equiLeaders = 0;
    int leftLeaderCnt = 0;
    int rightLeaderCnt = leader.getLeaderCount();
    for (int i = 0; i < A.length; i++) {
      if (A[i] == leader.getLeader()) {
        leftLeaderCnt++;
        rightLeaderCnt--;
      }
      if ((leftLeaderCnt > ((i + 1) / 2)) && (rightLeaderCnt > ((A.length - (i + 1)) / 2))) {
        equiLeaders++;
      }
    }

    return equiLeaders;
  }
}
