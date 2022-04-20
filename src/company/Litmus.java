package company;

import static java.lang.System.out;

public class Litmus {

    public void findArmstrongNumber() {
        int actualNum = 153;
        int num = actualNum;
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            sum = sum + (remainder * remainder * remainder);
        }

        if (actualNum == sum) {
            out.println("Yes it a armstrong number");
        } else {
            out.println("No it is not a armstrong number");
        }
    }

}
