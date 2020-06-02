package codility.p02_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OddOccurrencesInArrayTest {
  OddOccurrencesInArray oddOccurrencesInArray;

  @BeforeEach
  public void init() {
    oddOccurrencesInArray = new OddOccurrencesInArray();
  }

  @Test
  public void sample1() {
    int solution = oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    assertThat(solution).isEqualTo(7);
  }

  @Test
  public void sampleSolution2() {
    int solution = oddOccurrencesInArray.solution2(new int[]{9, 3, 9, 3, 9, 7, 9});
    assertThat(solution).isEqualTo(7);
  }
}
