package codility.p09_maximum_slice_problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSliceSumTest {
  MaxSliceSum maxSliceSum;

  @BeforeEach
  public void init() {
    maxSliceSum = new MaxSliceSum();
  }

  @Test
  public void sample1() {
    int solution = maxSliceSum.solution(new int[]{3, 2, -6, 4, 0});
    assertThat(solution).isEqualTo(5);

  }
}
