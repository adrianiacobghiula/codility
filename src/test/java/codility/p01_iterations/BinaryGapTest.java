package codility.p01_iterations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {

  private BinaryGap binaryGap;

  @BeforeEach
  public void init() {
    binaryGap = new BinaryGap();
  }

  @Test
  public void exampleWithOneGap() {
    int solution = binaryGap.solution(9);
    assertThat(solution).isEqualTo(2);
  }

  @Test
  public void exampleWithTwoGaps() {
    int solution = binaryGap.solution(529);
    assertThat(solution).isEqualTo(4);
  }

  @Test
  public void exampleWithOneGapAtThenEnd() {
    int solution = binaryGap.solution(20);
    assertThat(solution).isEqualTo(1);
  }

  @Test
  public void exampleWithNoGap1() {
    int solution = binaryGap.solution(15);
    assertThat(solution).isEqualTo(0);
  }

  @Test
  public void exampleWithNoGap2() {
    int solution = binaryGap.solution(32);
    assertThat(solution).isEqualTo(0);
  }

  @Test
  public void exampleWithTwoGaps2() {
    int solution = binaryGap.solution(1041);
    assertThat(solution).isEqualTo(5);
  }

  @Test
  public void extreme1() {
    int solution = binaryGap.solution(1);
    assertThat(solution).isEqualTo(0);
  }

  @Test
  public void extreme2() {
    int solution = binaryGap.solution(2147483647);
    assertThat(solution).isEqualTo(0);
  }

  @Test
  public void simple1() {
    int solution = binaryGap.solution(9);
    assertThat(solution).isEqualTo(2);
  }

  @Test
  public void simple2() {
    int solution = binaryGap.solution(19);
    assertThat(solution).isEqualTo(2);
  }

  @Test
  public void simple3() {
    int solution = binaryGap.solution(1162);
    assertThat(solution).isEqualTo(3);
  }

  @Test
  public void medium1() {
    int solution = binaryGap.solution(51712);
    assertThat(solution).isEqualTo(2);
  }

  @Test
  public void medium2() {
    int solution = binaryGap.solution(561892);
    assertThat(solution).isEqualTo(3);
  }

  @Test
  public void medium3() {
    int solution = binaryGap.solution(66561);
    assertThat(solution).isEqualTo(9);
  }

  @Test
  public void large6() {
    int solution = binaryGap.solution(1610612737);
    assertThat(solution).isEqualTo(28);
  }

}
