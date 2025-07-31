package src.patterns.src.maths;

import src.patterns.src.patterns.Pattern;

public class Maths {

    public static void main(String[] args) {

        System.out.println(new Maths().isPerfect(6));
    }

    // if number is perfect
    public boolean isPerfect(int n) {
        if(n==1) return false;
        int divisor = 2;
        int sumOfDivisors = 1;
        while(divisor <= Math.sqrt(n)){
            if(n%divisor ==0) {
                sumOfDivisors += divisor + (n/divisor);
            }
            divisor++;
        }
        return sumOfDivisors ==n;
    }
}
