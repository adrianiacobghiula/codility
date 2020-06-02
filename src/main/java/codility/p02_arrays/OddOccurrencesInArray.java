package codility.p02_arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
public class OddOccurrencesInArray {

  /*
  https://app.codility.com/demo/results/trainingTHN3GM-8G4/
  first medium1 test fails ?!
  */
  public int solution(int[] a) {
    return Arrays.stream(a)
        .boxed()
        .collect(Collectors.groupingBy(t -> t, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(t -> (t.getValue() & 1) == 1)
        .collect(Collectors.toList())
        .iterator()
        .next()
        .getKey();
  }

  /*
  https://app.codility.com/demo/results/trainingV63NZF-QAF/
   */
  public int solution2(int[] a) {
    Arrays.sort(a);
    int i = 1;
    int previous = a[0];
    int cnt = 1;
    while (i < a.length) {
      if (previous == a[i]) {
        cnt++;
      } else {
        if ((cnt & 1) == 1) {
          return previous;
        }
        previous = a[i];
        cnt = 1;
      }
      i++;
    }
    return previous;
  }

}
