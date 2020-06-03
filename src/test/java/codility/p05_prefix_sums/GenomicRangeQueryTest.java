package codility.p05_prefix_sums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenomicRangeQueryTest {
  GenomicRangeQuery genomicRangeQuery;

  @BeforeEach
  public void init() {
    genomicRangeQuery = new GenomicRangeQuery();
  }

  @Test
  public void sample1() {
    int[] solution = genomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6});
    assertThat(solution).containsExactly(2, 4, 1);
  }
}
