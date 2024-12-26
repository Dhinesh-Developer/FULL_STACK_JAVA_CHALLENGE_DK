public class DAY11 {
    public static void main(String[] args) {

        /* PRIMITIVE DATA TYPES*/
        // range -128 to +127   -> 1 byte
        byte a = 10;
        System.out.println(a);

        // range -32768 to +32767   -> 2 byte
        short b = 45;
        System.out.println(b);

        // range -2147483648 to +2147483647  -> 4 byte
        int S =764517168;
        System.out.println(S);

        // range -9223372036854775808 to 9223372036854775807   -> 8 byte
        // suffix either l Or L is accepted
        long l = 78519841234615l;
        System.out.println(l);

        /* REAL NUMBERS*/

        // IEEE format    -3.4e^38  to  +3.4e^38   -> 4 byte
        // suffix f Or F is accepted
        float f = 85.7f;
        System.out.println(f);

        // -1.7e^308  to  +1.7e^308   -> 8 bytes
        double d = 73617.165324;
        System.out.println(d);

        /* Character*/

        // returns the UNICODE values for the specific character.
        char ch = 'A';
        System.out.println(ch);

        //Depends on JVM.
        boolean bo = false;
        System.out.println(bo);
    }
}
