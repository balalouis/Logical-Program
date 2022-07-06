package recursive;

public class Fibonacci {

    public void findFibonacciViaLoop(int num) {
        int prev = 0, curr = 1;
        for (int i = 1; i <= num; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println("Fibonacci Value: " + curr);
    }

    public int findFibonacciViaRecursive(int prev, int curr, int num) {
        if (num == 1) {
            return curr;
        }
        num--;
        int temp = prev + curr;
        prev = curr;
        curr = temp;
        return findFibonacciViaRecursive(prev, curr, num);
    }

}
