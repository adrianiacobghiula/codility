package codility.p07_stacks_and_queues;

/*
https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
 */
public class Nesting {

  // https://app.codility.com/demo/results/trainingES9HJA-A2Y/
  public int solution(String S) {
    int opened = 0;
    for (int i = 0; i < S.length(); i++) {
      char value = S.charAt(i);
      if (value == '(')
        opened++;
      if (value == ')')
        opened--;
      if (opened < 0) {
        return 0;
      }
    }
    return (opened == 0) ? 1 : 0;
  }
}
