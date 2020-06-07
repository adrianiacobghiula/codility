package codility.p07_stacks_and_queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static codility.p07_stacks_and_queues.Brackets.PROPERLY_NESTING;
import static codility.p07_stacks_and_queues.Brackets.INVALID_NESTING;
import static org.assertj.core.api.Assertions.assertThat;

public class BracketsTest {

  Brackets brackets;

  @BeforeEach
  public void init() {
    brackets = new Brackets();
  }

  @Test
  public void sample1() {
    int solution = brackets.solution("{[()()]}");
    assertThat(solution).isEqualTo(PROPERLY_NESTING);
  }

  @Test
  public void sample2() {
    int solution = brackets.solution("([)()]");
    assertThat(solution).isEqualTo(INVALID_NESTING);
  }


}
