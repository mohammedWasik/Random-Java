package AnimalOOP;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("woof woof my hooman!");
    }
    public void makeNoise(String name){
        //same method same diffterent param-> method overloading
        System.out.println(name+ "says woof woof my hooman!");
    }
    public void growl(){
        System.out.println("cats don't growl");
    }

}
