package recursive;

public class FibonacciJan2023 {

    public void fibonacciViaLoop(int num){
        int first =0;
        int second =1;
        int currentValue=0;
        for (int i=0; i<num;i++){
            currentValue = first + second;
            first = second;
            second = currentValue;
            System.out.println(currentValue);
        }
        System.out.println("Fibonacci :"+currentValue);
    }

    public int fibonacciViaRecursion(int num,int firstValue, int secondValue, int value){
        if(num==0){
            return value;
        }
        value = firstValue+secondValue;
        firstValue = secondValue;
        secondValue = value;
        num--;
        return fibonacciViaRecursion(num,firstValue,secondValue,value);
    }

}
