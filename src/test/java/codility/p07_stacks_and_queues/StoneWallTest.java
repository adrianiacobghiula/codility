package codility.p07_stacks_and_queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StoneWallTest {
  StoneWall stoneWall;

  @BeforeEach
  public void init() {
    stoneWall = new StoneWall();
  }

  @Test
  public void sample1() {
    int requiredBlocks = stoneWall.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});
    assertThat(requiredBlocks).isEqualTo(7);
  }

  @Test
  public void sameSize() {
    int requiredBlocks = stoneWall.solution(new int[]{8, 8, 8, 8});
    assertThat(requiredBlocks).isEqualTo(1);
  }
}
