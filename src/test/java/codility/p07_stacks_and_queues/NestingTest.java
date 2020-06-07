package codility.p07_stacks_and_queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NestingTest {
  Nesting nesting;

  @BeforeEach
  public void init() {
    nesting = new Nesting();
  }

  @Test
  public void sample1() {
    int solution = nesting.solution("(()(())())");
    assertThat(solution).isEqualTo(1);

  }

  @Test
  public void sample2() {
    int solution = nesting.solution("())");
    assertThat(solution).isEqualTo(0);

  }
}
