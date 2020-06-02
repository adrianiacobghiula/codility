package codility.p03_time_complexity;


/*
https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
https://app.codility.com/demo/results/trainingSUP9WY-RZY/
*/

public class FrogJump {
  public int solution(int X, int Y, int D) {
    int difference = Y - X;
    int rest = difference % D;
    int addOneJump = (rest > 0) ? 1 : 0;
    return difference / D + addOneJump;
  }
}
