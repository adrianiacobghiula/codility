package codility.p06_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
  Triangle triangle;

  @BeforeEach
  public void init() {
    triangle = new Triangle();
  }

  @Test
  public void sample1() {
    int solution = triangle.solution(new int[]{10, 2, 5, 1, 8, 20});
    assertThat(solution).isEqualTo(1);
  }

  @Test
  public void sample2() {
    int solution = triangle.solution(new int[]{10, 50, 5, 1});
    assertThat(solution).isEqualTo(0);
  }
}
