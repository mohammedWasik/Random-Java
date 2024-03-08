package Wrapper;

import AnimalOOP.Animal;

public class Printer <T>{
    private final T value;
    public Printer(T value){
        this.value=value;
    }
    public void print(){
        System.out.println(value);
    }
}
