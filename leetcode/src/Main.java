/**
 * 考虑数组A可能为空的情况
 * timelimited 输入的数组A超大个，很长。现算法已经n*n了，肯定不行
 */

public class Main {

    public static void main(String[] args) {
        int[]A={};
        int maxAns = maxRotateFunction(A);
        System.out.print(maxAns);
    }

    public static int maxRotateFunction(int[] A) {
        if (A.length != 0 && A != null) {
            int n = A.length;
            int[] F = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                F[i] = 0;
                for (int j = 0; j < n; j++) { //xunhuan fangshi

                    F[i] += j * A[k];
                    if (j == n - 1) {

                    } else {
                        k++;
                    }
                    if (k >= n) {
                        k = k - n;
                    }
                }
            }
            int maxAns = -2147483648;
            for (int i = 0; i < n; i++) {
                if (F[i] > maxAns) {
                    maxAns = F[i];
                }
            }
            return maxAns;
        }else{
            return 0;
        }
    }
}
