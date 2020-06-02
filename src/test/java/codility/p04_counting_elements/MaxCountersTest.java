package codility.p04_counting_elements;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxCountersTest {
  MaxCounters maxCounters;


  @BeforeEach
  public void init() {
    maxCounters = new MaxCounters();
  }

  @Test
  public void example1() {
    int[] maxCounters = this.maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4});
    assertThat(maxCounters).containsExactly(3, 2, 2, 4, 2);
  }
}
