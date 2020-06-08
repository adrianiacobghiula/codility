package codility.p07_stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/
 */
public class StoneWall {
  // https://app.codility.com/demo/results/trainingMQBNVG-HUH/
  public int solution(int[] heights) {
    Deque<Integer> stack = new ArrayDeque<>();
    int requiredBlocks = 0;
    for (Integer height : heights) {
      while ((!stack.isEmpty()) && (stack.peekLast() > height)) {
        stack.removeLast();
      }

      if (stack.isEmpty() || stack.peekLast() < height) {
        stack.add(height);
        requiredBlocks++;
      }
    }
    return requiredBlocks;
  }
}
