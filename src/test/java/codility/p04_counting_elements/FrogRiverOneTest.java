package codility.p04_counting_elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverOneTest {
  FrogRiverOne frogRiverOne;

  @BeforeEach
  public void init() {
    frogRiverOne = new FrogRiverOne();
  }

  @Test
  public void test1() {
    int minimPosition = frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4});
    assertThat(minimPosition).isEqualTo(6);
  }
}
