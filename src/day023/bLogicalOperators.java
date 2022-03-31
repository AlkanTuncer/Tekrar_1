package day023;

public class bLogicalOperators {
    public static void main(String[] args) {

        /*
                & (shift+6)                  - and
                | (alt gr+backspace yanı)    - or
                && - and
                || - or
                ^ (shift+3 ve space)         - xor
                !                            - not
        */


        // önce true ve false literalleriyle kullanalım

        //  & - AND - VE
        boolean res1= false & false; // F
        boolean res2= false & true;  // F
        boolean res3= true  & false; // F
        boolean res4= true  & true;  // T

        // | - OR - YA DA
        boolean res5=false | false; // F
        boolean res6=false | true;  // T
        boolean res7=true  | false; // T
        boolean res8=true  | true;  // T

        // ^ - XOR - İki operant birbirinin zıttı ise TRUE birbirinin aynısı ise FALSE döner.
        boolean res9=false ^ false; // F
        boolean res10=false^ true;  // T
        boolean res11=true ^ false; // T
        boolean res12=true ^ true;  // F


        // ! - NOT - Değil Operatörü
        boolean res100=!false;
        boolean res200=!true;

        System.out.println(res100);
        System.out.println(res200);


        // 5: 00000101
        // 3: 00000011
        byte b1=5;
        byte b2=3;

        int r1=b1&b2; // sonuc 1  -- Binary de sadece 1-1 True verdigi için 00000001 olur
        int r2=b1|b2; // sonuc 7  -- 00000111 olur.
        int r3=b1^b2; // sonuc 6  -- Sadece zıtlar True verir ve 00000110 olur.


    }
}
