package codility.p07_stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/
 */
public class Fish {

  // https://app.codility.com/demo/results/trainingHD66RN-H63/
  public int solution(int[] sizes, int[] directions) {
    int aliveUpstream = 0;
    Deque<Integer> fishesDownstream = new ArrayDeque<>();
    for (int i = 0; i < sizes.length; i++) {
      int fishSize = sizes[i];
      int direction = directions[i];
      if (upstream(direction)) {
        while (!fishesDownstream.isEmpty() && fishesDownstream.peek() < fishSize) {
          fishesDownstream.pop();
        }
        if (fishesDownstream.isEmpty()) {
          aliveUpstream++;
        }
      }
      if (downstream(direction)) {
        fishesDownstream.push(fishSize);
      }
    }
    return aliveUpstream + fishesDownstream.size();
  }

  private boolean upstream(int direction) {
    return 0 == direction;
  }

  private boolean downstream(int direction) {
    return 1 == direction;
  }
}
