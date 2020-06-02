package codility.p02_arrays;

/*
https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
https://app.codility.com/demo/results/trainingWASNNF-49F/
 */
public class CyclicRotation {

  public int[] solution(int[] a, int k) {

    if (a.length == 0) {
      return a;
    }

    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[(i + k) % a.length] = a[i];
    }

    return b;
  }
}
