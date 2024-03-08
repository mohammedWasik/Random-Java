package u8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1,2,3,4,5);
        for(int i:num){
            System.out.print(i+"  ");
        }

        System.out.println();

        List<Integer>even = num.stream().filter(n->n%2==0).toList();
        for (int i : even){
            System.out.print(i+"  ");
        }
//        + - / * %
//        ++ -- += =+ -= =- *=
//        == !=
//        a>b?true:false



    }
}
