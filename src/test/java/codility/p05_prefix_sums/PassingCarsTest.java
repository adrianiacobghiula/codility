package codility.p05_prefix_sums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassingCarsTest {
  PassingCars passingCars;

  @BeforeEach
  public void init() {
    passingCars = new PassingCars();
  }

  @Test
  public void sample1() {
    int solution = passingCars.solution(new int[]{0, 1, 0, 1, 1});
    assertThat(solution).isEqualTo(5);
  }

}
