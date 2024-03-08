package AnimalOOP;

 public class Cat extends  Animal{

     private static int numberOfCats;
     public Cat(){
         numberOfCats++;
     }
     public static int getNumberOfCats() {
         return numberOfCats;
     }

     @Override
    public void makeNoise() {
        System.out.println("meow meow my slave");
    }

    public void growl(){
        System.out.println("cats don't growl");
    }

    protected void destroyPlanet(){
         System.out.println("peu peu peu");
     }

}
