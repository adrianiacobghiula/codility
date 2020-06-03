package codility.p05_prefix_sums;

import codility.p04_counting_elements.PermCheck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountDivTest {
  CountDiv countDiv;

  @BeforeEach
  public void init() {
    countDiv = new CountDiv();
  }

  @Test
  public void sample1() {
    int solution = countDiv.solution(6, 11, 2);
    assertThat(solution).isEqualTo(3);
  }

  @Test
  public void sample2() {
    int solution = countDiv.solution(2, 10, 2);
    assertThat(solution).isEqualTo(5);
  }

  @Test
  public void sample3() {
    int solution = countDiv.solution(1, 1, 2);
    assertThat(solution).isEqualTo(0);
  }

  @Test
  public void sample4() {
    int solution = countDiv.solution(0, 0, 4);
    assertThat(solution).isEqualTo(1);
  }


}
