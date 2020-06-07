package codility.p07_stacks_and_queues;

import java.util.ArrayDeque;
import java.util.Deque;

/*
https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 */
public class Brackets {

  public static final int INVALID_NESTING = 0;
  public static final int PROPERLY_NESTING = 1;

  private boolean isProperlyNested(char current, char popped) {
    return ((popped == '(') && (current == ')')) ||
        ((popped == '[') && (current == ']')) ||
        ((popped == '{') && (current == '}'));
  }

  //https://app.codility.com/demo/results/training6VUEYT-SDD/
  public int solution(String S) {
    Deque<Character> stack = new ArrayDeque<Character>();
    for (Character value : S.toCharArray()) {
      switch (value) {
        case '(':
        case '[':
        case '{': {
          stack.push(value);
          break;
        }
        case ')':
        case ']':
        case '}': {
          if (stack.isEmpty()) {
            return INVALID_NESTING;
          }
          Character popped = stack.pop();
          if (!isProperlyNested(value, popped)) {
            return INVALID_NESTING;
          }
        }

      }
    }
    if (!stack.isEmpty()) {
      return INVALID_NESTING;
    }
    return PROPERLY_NESTING;
  }
}
