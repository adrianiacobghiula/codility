package codility.p07_stacks_and_queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FishTest {
  Fish fish;

  @BeforeEach
  public void init() {
    fish = new Fish();
  }

  @Test
  public void sample1() {
    int alive = fish.solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0});
    assertThat(alive).isEqualTo(2);
  }
}
