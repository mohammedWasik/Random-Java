package BasicJava;

public class BasicOne {
    public static  void main(String[]args){
        /*
            primitive data type = 8 types
            byte =-128 to +127 , anything else is error
            short =-32768 to 32767 , anything else is error
            int =-2^31 to 2^(32-1) , anything else is error
            long,float,double,boolean,char
         */
        byte aByte=0;
        short aShort =-32756;
        int aInt  = 0x1a,binVal = 0b11010;//26
        long aLong = 222222222333L,creditCardNumber = 1233334_5678_9012_3456L;
        System.out.println(aInt);

        /*
            casting
            boolean -  !!no casting
         */

        int aaa = aByte;
        int asdf = (int)aLong;
        System.out.println(asdf);


    }
}
