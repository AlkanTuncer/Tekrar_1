package day023;

public class aRelationalOperators {
    public static void main(String[] args) {

        /*
                < , <= , >, >=
                == EŞİT MİDİR?
                != EŞİT DEGİL MİDİR?
         */

        boolean res1=5>3;   // always true
        boolean res2=5<3;   // always false

        boolean res3=5!=3;  // 5 - 3'e eşit değil midir? EVET değildir TRUE.
        boolean res4=5==3;  // 5 - 3'e eşit midir? HAYIR değildir FALSE.

        boolean res5= 5>=5;
        boolean res6= 5<=5;

        System.out.println("Result 1 = "+res1);
        System.out.println("Result 2 = "+res2);
        System.out.println("Result 3 = "+res3);
        System.out.println("Result 4 = "+res4);
        System.out.println("Result 5 = "+res5);
        System.out.println("Result 6 = "+res6);
        System.out.println();

        int firstNumber=53;
        int secondNumber=17;
        System.out.println("1st Number is greater than 2nd Number : "+(firstNumber>secondNumber));
        System.out.println("These to numbers are equal : "+(firstNumber==secondNumber));

    }
}
