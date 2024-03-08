package u8.CastingType;

public class TypeCasting {
    public static void main(String[] args) {
        byte b =127;
        short s = 11111;
        int i=33333333;
        float f = 1.1F;
        double d = 333.33333333333333333;
        long l=222222222222L;


        double newByte = b;
        System.out.println(newByte);
        byte newDouble = (byte) d;
        System.out.println(newDouble);

        String str = "222";
        int newInt = Integer.parseInt(str);
        String newStar = String.valueOf(newInt);
        System.out.println(newStar.getClass());


    }
}
