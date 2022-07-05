package recursive;

public class Factorial {

    public int findFactorial(int num, int sum) {
        if (num == 1) {
            return sum;
        }
        sum = sum * (num - 1);
        num = num - 1;
        return findFactorial(num, sum);
    }

}
