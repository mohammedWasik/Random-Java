package AnimalOOP;

public class Main {
    public static void main(String[] args) {
        /*
        turning dog into animal, upcasting
        */
        Cat beerus= new Cat();
        Cat tom= new Cat();
        Cat puss= new Cat();
        beerus.growl();
        beerus.makeNoise();
//        beerus.getNumberOfCats();

        System.out.println(Cat.getNumberOfCats());

        byte b = 127;
        int i = b;

        doThingsYouPet(beerus);

        Dog superDog = new Dog();
        superDog.makeNoise();
        superDog.makeNoise("superdog from krpton ");

    }
    public  static  void  doThingsYouPet(Animal animal){
        animal.makeNoise();
        if(animal instanceof Dog){
            /*
            downcasting,
            turning animal to dog.
            dangerous if u try to turn cat into dog it will explode
            */
            Dog myDog = (Dog)animal;
            myDog.growl();
        }





    }

}
