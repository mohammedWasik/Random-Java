package LambdaProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaProblem {
    public static void main(String[] args) {
        //sum of two numbers
        LambdaSum lam = (x,y)->x+y;
        int res = lam.sum(5,6);
        System.out.println(res);

        //if string empty
        //preidcate built in functional interface
        Predicate<String> isEmptyString = String::isEmpty;

        String a = "";
        String b="a1qa";

        System.out.println("a is "+isEmptyString.test(a));
        System.out.println("b is "+isEmptyString.test(b));

        // convert a list of strings to uppercase and lowercase.
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");
        for (String str : stringList){
            System.out.print(str+" ");
        }
        System.out.println();
        //to upper case
        stringList.replaceAll(String::toLowerCase);
        for (String str : stringList){
            System.out.print(str+" ");
        }
        System.out.println();
        //to lowercase
        stringList.replaceAll(String::toUpperCase);
        for (String str : stringList){
            System.out.print(str+" ");
        }
        System.out.println();

        //sort alphabetical order
        stringList.sort(String::compareToIgnoreCase);
        for (String str : stringList){
            System.out.print(str+" ");
        }
        System.out.println();


        //filter odd even
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        List<Integer> evenNum = nums.stream().filter(n->n%2==0).toList();
        for(int i:evenNum){
            System.out.print(i+" ");
        }
        System.out.println();
        List<Integer> odd = nums.stream().filter(n->n%2!=0).toList();
        for(int i:odd){
            System.out.print(i+" ");
        }

        List<Double> numsDoub = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        System.out.println(numsDoub);
        double avg = numsDoub.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println(avg);

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Lambda expression for iteration
        names.forEach(name -> System.out.println(name));


        String str = "222";
        int ii = Integer.parseInt(str);




    }
}
