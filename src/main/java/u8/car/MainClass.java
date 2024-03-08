package u8.car;

public class MainClass {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();
        mercedes.dualSilencer();
        mercedes.numberPlate();
        mercedes.numberPlate("number1");
        mercedes.numberPlate("number1","number2");
    }
}
