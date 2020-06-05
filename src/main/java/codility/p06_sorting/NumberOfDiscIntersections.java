package codility.p06_sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 */
public class NumberOfDiscIntersections {

  private static final int MAX_ALLOWED_INTERSECTIONS = 10_000_000;
  public static final Comparator<Circle> COMPARATOR = Comparator.comparingLong(o -> o.start);

  public static class Circle {
    private final long start;
    private final long end;

    public Circle(long start, long end) {
      this.start = start;
      this.end = end;
    }
  }

  // https://app.codility.com/demo/results/trainingAKN4FT-DAT/
  // solution that is not fast enough
  public int solutionTooSlow(int[] a) {
    Circle[] circles = new Circle[a.length];
    for (int i = 0; i < a.length; i++) {
      circles[i] = new Circle(i - (long) a[i], i + (long) a[i]);
    }
    Arrays.sort(circles, COMPARATOR);
    int intersects = 0;
    for (int i = 0; i < circles.length - 1; i++) {
      Circle startCircle = circles[i];
      int index = Arrays.binarySearch(circles, new Circle(startCircle.end, startCircle.end), COMPARATOR);
      if (index < 0) {
        index = -index - 2;
      } else {
        while ((index + 1 < circles.length) && (circles[index + 1].start <= startCircle.end)) {
          index++;
        }
      }
      intersects += index - i;
      if (intersects > MAX_ALLOWED_INTERSECTIONS) {
        return -1;
      }
    }
    return intersects;
  }

  // https://app.codility.com/demo/results/training8XY2CE-Q79/
  public int solution(int[] a) {
    long[] start = new long[a.length];
    long[] end = new long[a.length];
    for (int i = 0; i < a.length; i++) {
      start[i] = i - (long) a[i];
      end[i] = i + (long) a[i];
    }
    Arrays.sort(start);
    Arrays.sort(end);
    int openedDisks = 0;
    int intersections = 0;
    int io = 0;
    int ic = 0;
    while (io < a.length) {
      if (start[io] <= end[ic]) {
        intersections += openedDisks;
        if (intersections > MAX_ALLOWED_INTERSECTIONS) {
          return -1;
        }
        openedDisks++;
        io++;
      } else if (start[io] > end[ic]) {
        openedDisks--;
        ic++;
      }
    }
    return intersections;
  }

}
