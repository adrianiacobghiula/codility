package codility.p08_leader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DominatorTest {
  Dominator dominator;

  @BeforeEach
  public void init() {
    dominator = new Dominator();
  }

  @Test
  public void sample1() {
    int arrayDominator = dominator.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3});
    assertThat(arrayDominator).isEqualTo(6);
  }

}
