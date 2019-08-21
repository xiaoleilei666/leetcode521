package sortedsquares;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{-4, -1, 0, 3, 10};
        //int[] B = sortedSquares(A);
        int[] B = sortedSquares1(A);
        for (int k = 0; k < A.length; k++) {
            System.out.println(B[k]);
        }

    }
    /**
     * 改造前
     */
    private static int[] sortedSquares(int[] A) {
        int[] C = new int[A.length];
        int[] D = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                C[i] = -A[i];
            } else {
                C[i] = A[i];
            }
        }
        Arrays.sort(C);
        int index = -1;
        for (int j = 0; j < C.length; j++) {
            double pow = Math.pow(C[j], 2);
            index++;
            D[index] = (int) pow;
        }
        return D;
    }
    /**
     * 改造后
     */
    private static int[] sortedSquares1(int[] A) {
        int[] C = new int[A.length];
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            double pow = Math.pow(A[i], 2);
            index++;
            C[index] = (int) pow;
        }
        Arrays.sort(C);
        return C;
    }
}
