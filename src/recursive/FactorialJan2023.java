package recursive;

public class FactorialJan2023 {

    public void factorialViaLoop(int num){
        int currentMulValue = num;
        while (num!=1){
            System.out.println(currentMulValue);
            currentMulValue = currentMulValue * (num-1);
            num--;
        }
        System.out.println("Factorial value"+currentMulValue);
    }

    public int factorialViaRecursive(int num, int currentValue){
        if(num==1){
            return currentValue;
        }
        currentValue = currentValue * (num-1);
        num--;
        return factorialViaRecursive(num,currentValue);
    }

}
