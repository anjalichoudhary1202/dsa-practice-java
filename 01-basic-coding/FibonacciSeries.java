import java.util.Arrays;

public class FibonacciSeries {

    public static int fibonacciMemoize(int n, int[] dp) {
        if (n == 1 || n == 2) {
            return dp[n] = n - 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int secondLast = fibonacciMemoize(n - 2, dp);
        int last = fibonacciMemoize(n - 1, dp);

        return dp[n] = secondLast + last;
    }

    public static void fibonacciIteration(int n) {
      int last = -1;
      int secondLast = -1;

      for(int i=1;i<=n;i++) {
        if(last == -1) {
          last = 0;
          System.out.print(last + " ");
        }
        else if(secondLast == -1) {
          secondLast = 1;
          System.out.print(secondLast + " ");
        } else{
          int currentNumber = last+secondLast;
          last = secondLast;
          secondLast = currentNumber;
          System.out.print(currentNumber + " ");
        }
      }
    }
    public static void main(String[] args) {
        int n = 8;
        fibonacciIteration(n);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        fibonacciMemoize(n, dp);

        for (int i = 1; i <= n; i++) {
            //System.out.print(dp[i] + " ");
        }

        System.out.println();
    }
}