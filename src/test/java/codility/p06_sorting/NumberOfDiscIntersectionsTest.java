package codility.p06_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfDiscIntersectionsTest {
  NumberOfDiscIntersections numberOfDiscIntersections;

  @BeforeEach
  public void init() {
    numberOfDiscIntersections = new NumberOfDiscIntersections();
  }

  @Test
  public void solution1() {
    int solution = numberOfDiscIntersections.solution(new int[]{1, 5, 2, 1, 4, 0});
    assertThat(solution).isEqualTo(11);
  }

  @Test
  public void solution2() {
    int solution = numberOfDiscIntersections.solution(new int[]{1, 0, 1, 0});
    assertThat(solution).isEqualTo(4);
  }
}
