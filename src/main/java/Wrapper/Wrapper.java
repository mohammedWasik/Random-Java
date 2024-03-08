package Wrapper;

public class Wrapper {
         /*
        Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        primitive   Wrapper
        byte	    Byte
        short	    Short
        int	        Integer
        long	    Long
        float	    Float
        double	    Double
        boolean	    Boolean
        char	    Character
        */


    public static void main(String[] args) {
       a:
        for(int i = 0; i<= 10; i++) {
            b:
            for (int j = 0; j <= 15; j++) {
                c:
                for (int k = 0; k <= 20; k++) {
                    System.out.println(k);
                    if (k == 5) {
                        break a;
                    }
                }
            }
        }
    }
}
