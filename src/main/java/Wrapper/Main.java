package Wrapper;

import AnimalOOP.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main extends Cat{
    public static void main(String[] args) {
        //generic classes
        Printer<Integer> num = new Printer<>(20);
        num.print();
        Printer<Double> doubs = new Printer<>(33.5);
        doubs.print();
        Printer<Cat> cat = new Printer<Cat>(new Cat());
        cat.print();


        shout(22,1);
        shout("ola",2);
        shout(true,3);
        System.out.println(shout("Courage",5));

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

        Main cat1 = new Main();
            cat1.makeNoise();
            cat1.growl();
            cat1.destroyPlanet();
    }

    private static <T,V> T  shout (T elem,V ele){
        System.out.println(elem+"!!!!");
        return  elem;
    }

    private static void printList(List<?> myList){
//        ? will allow anything
        System.out.println();
    }


}
