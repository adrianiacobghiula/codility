package codility.p09_maximum_slice_problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProfitTest {
  MaxProfit maxProfit;

  @BeforeEach
  public void init() {
    maxProfit = new MaxProfit();
  }

  @Test
  public void sample1() {
    int solution = maxProfit.solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367});
    assertThat(solution).isEqualTo(356);
  }
}
