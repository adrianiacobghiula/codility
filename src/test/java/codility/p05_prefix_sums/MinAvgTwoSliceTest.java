package codility.p05_prefix_sums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinAvgTwoSliceTest {
  MinAvgTwoSlice minAvgTwoSlice;

  @BeforeEach
  public void init() {
    minAvgTwoSlice = new MinAvgTwoSlice();
  }

  @Test
  public void sample1() {
    int solution = minAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8});
    assertThat(solution).isEqualTo(1);
  }

}
