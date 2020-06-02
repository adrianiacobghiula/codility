package codility.p03_time_complexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TapeEquilibriumTest {

  TapeEquilibrium tapeEquilibrium;

  @BeforeEach
  public void init() {
    tapeEquilibrium = new TapeEquilibrium();
  }

  @Test
  public void sample1() {
    int minimalDifference = tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3});
    assertThat(minimalDifference).isEqualTo(1);
  }

}
