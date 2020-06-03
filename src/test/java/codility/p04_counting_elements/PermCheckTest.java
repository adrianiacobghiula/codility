package codility.p04_counting_elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermCheckTest {
  PermCheck permCheck;

  @BeforeEach
  public void init() {
    permCheck = new PermCheck();
  }

  @Test
  public void sample1() {
    int solution = permCheck.solution(new int[]{4, 1, 3, 2});
    assertThat(solution).isEqualTo(1);
  }

  @Test
  public void sample2() {
    int solution = permCheck.solution(new int[]{4, 1, 3});
    assertThat(solution).isEqualTo(0);
  }

}
