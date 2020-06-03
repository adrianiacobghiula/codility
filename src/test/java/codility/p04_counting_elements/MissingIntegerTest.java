package codility.p04_counting_elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MissingIntegerTest {
  MissingInteger missingInteger;

  @BeforeEach
  public void init() {
    missingInteger = new MissingInteger();
  }

  @Test
  public void sample1() {
    int solution = missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2});
    assertThat(solution).isEqualTo(5);
  }

  @Test
  public void sample2() {
    int solution = missingInteger.solution(new int[]{1, 2, 3});
    assertThat(solution).isEqualTo(4);
  }

  @Test
  public void sample3() {
    int solution = missingInteger.solution(new int[]{-1, -2});
    assertThat(solution).isEqualTo(1);
  }

}
