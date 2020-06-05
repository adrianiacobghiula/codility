package codility.p06_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctTest {
  Distinct distinct;

  @BeforeEach
  public void init() {
    distinct = new Distinct();
  }

  @Test
  public void sample1() {
    int solution = distinct.solution(new int[]{2, 1, 1, 2, 3, 1});
    assertThat(solution).isEqualTo(3);
  }

  @Test
  public void sample1Stream() {
    int solution = distinct.solutionStreams(new int[]{2, 1, 1, 2, 3, 1});
    assertThat(solution).isEqualTo(3);
  }

}
