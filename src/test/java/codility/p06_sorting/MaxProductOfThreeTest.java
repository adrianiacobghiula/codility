package codility.p06_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProductOfThreeTest {
  MaxProductOfThree maxProductOfThree;

  @BeforeEach
  public void init() {
    maxProductOfThree = new MaxProductOfThree();
  }

  @Test
  public void sample1() {
    int solution = maxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6});
    assertThat(solution).isEqualTo(60);
  }
}
