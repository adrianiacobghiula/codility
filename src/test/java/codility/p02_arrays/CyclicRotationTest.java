package codility.p02_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CyclicRotationTest {
  CyclicRotation cyclicRotation;

  @BeforeEach
  public void init() {
    cyclicRotation = new CyclicRotation();
  }

  @Test
  public void sample1() {
    int[] solution = cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3);

    assertThat(solution).containsExactly(9, 7, 6, 3, 8);
  }

  @Test
  public void sample2() {
    int[] solution = cyclicRotation.solution(new int[]{0, 0, 0}, 1);

    assertThat(solution).containsExactly(0, 0, 0);
  }

  @Test
  public void sample3() {
    int[] solution = cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4);

    assertThat(solution).containsExactly(1, 2, 3, 4);
  }

  @Test
  public void sample4() {
    int[] solution = cyclicRotation.solution(new int[]{1, 2, 3, 4}, 0);

    assertThat(solution).containsExactly(1, 2, 3, 4);
  }

  @Test
  public void sample5() {
    int[] solution = cyclicRotation.solution(new int[]{1, 2, 3, 4, 5, 6}, 8);

    assertThat(solution).containsExactly(5, 6, 1, 2, 3, 4);
  }

}
