package codility.p08_leader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EquiLeaderTest {
  EquiLeader equiLeader;

  @BeforeEach
  public void init() {
    equiLeader = new EquiLeader();
  }

  @Test
  public void sample1() {
    int equiLeadersCount = equiLeader.solution(new int[]{4, 3, 4, 4, 4, 2});
    assertThat(equiLeadersCount).isEqualTo(2);
  }
}
