package codility.p03_time_complexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJumpTest {

  private FrogJump frogJump;

  @BeforeEach
  public void init() {
    frogJump = new FrogJump();
  }

  @Test
  public void exampleTest() {
    int solution = frogJump.solution(10, 85, 30);
    assertThat(solution).isEqualTo(3);
  }

}
