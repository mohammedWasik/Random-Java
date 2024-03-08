package LambdaProblems;

import java.util.Arrays;

public class Random {
    public static void main(String[] args) {
        int [] randomInt = {5,4,3,2,1,0};
        Arrays.stream(randomInt).forEach(n-> System.out.println(n));
    }
}
