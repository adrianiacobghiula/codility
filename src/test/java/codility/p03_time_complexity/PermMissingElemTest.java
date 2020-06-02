package codility.p03_time_complexity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermMissingElemTest {
  PermMissingElem permMissingElem = new PermMissingElem();

  @BeforeEach
  public void init() {
    permMissingElem = new PermMissingElem();
  }

  @Test
  public void sample1() {
    int missingElement = permMissingElem.solution(new int[]{2, 3, 1, 5});
    assertThat(missingElement).isEqualTo(4);
  }

  @Test
  public void sampleOnSolution2() {
    int missingElement = permMissingElem.solution2(new int[]{2, 3, 1, 5});
    assertThat(missingElement).isEqualTo(4);
  }
}
