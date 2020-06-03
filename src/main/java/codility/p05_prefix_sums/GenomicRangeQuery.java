package codility.p05_prefix_sums;

import java.util.Arrays;

//https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
public class GenomicRangeQuery {

  private static final int A_IMPACT = 1;
  private static final int C_IMPACT = 2;
  private static final int G_IMPACT = 3;
  private static final int T_IMPACT = 4;

  //https://app.codility.com/demo/results/training5FP4XA-R7W/
  public int[] solution(String s, int[] p, int[] q) {

    int M = p.length;
    int N = s.length();
    int aCnt = 0;
    int cCnt = 0;
    int gCnt = 0;
    //A, C, G and T have impact factors of 1, 2, 3 and 4
    int[] aLetter = new int[N];
    int[] cLetter = new int[N];
    int[] gLetter = new int[N];
    for (int i = 0; i < N; i++) {
      if (s.charAt(i) == 'A')
        aLetter[aCnt++] = i;
    }
    for (int i = 0; i < N; i++) {
      if (s.charAt(i) == 'C')
        cLetter[cCnt++] = i;
    }
    for (int i = 0; i < N; i++) {
      if (s.charAt(i) == 'G')
        gLetter[gCnt++] = i;
    }

    int[] answers = new int[M];
    for (int k = 0; k < M; k++) {
      int start = p[k];
      int end = q[k];
      if (search(aCnt, aLetter, start, end)) {
        answers[k] = A_IMPACT;
      } else if (search(cCnt, cLetter, start, end)) {
        answers[k] = C_IMPACT;
      } else if (search(gCnt, gLetter, start, end)) {
        answers[k] = G_IMPACT;
      } else {
        answers[k] = T_IMPACT;
      }

    }
    return answers;
  }

  private boolean search(int aCnt, int[] letterPosition, int start, int end) {
    int pos = Arrays.binarySearch(letterPosition, 0, aCnt, start);
    int i = pos >= 0 ? pos : -pos - 1;
    while (i < aCnt) {
      if ((start <= letterPosition[i]) && (letterPosition[i] <= end)) {
        return true;
      }
      if (letterPosition[i] > end) {
        break;
      }
      i++;
    }
    return false;
  }

}