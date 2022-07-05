package recursive;

public class Factorial {

    public int findFactorialRecursive(int num, int sum) {
        if (num == 1) {
            return sum;
        }
        sum = sum * (num - 1);
        num = num - 1;
        return findFactorialRecursive(num, sum);
    }

    public int findFactorialViaLoop(int num, int sum) {
        for (int i = num; i > 1; i--) {
            sum = sum * (num - 1);
            num--;
        }
        return sum;
    }

}
