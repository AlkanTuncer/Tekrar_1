package day023;

public class Ornekler {
    public static void main(String[] args) {

        char d1='M';
        char d2='E';
        char d3='S';
        char d4='A';
        char d5='J';

        int key=5;

        char c1=(char)(d1^key);
        char c2=(char)(d2^key);
        char c3=(char)(d3^key);
        char c4=(char)(d4^key);
        char c5=(char)(d5^key);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c4);
        System.out.print(c5);
        System.out.println();

        char d1bir=(char)(c1^key);
        char d2iki=(char)(c2^key);
        char d3uc=(char)(c3^key);
        char d4dort=(char)(c4^key);
        char d5bes=(char)(c5^key);
        System.out.print(d1bir);
        System.out.print(d2iki);
        System.out.print(d3uc);
        System.out.print(d4dort);
        System.out.print(d5bes);

    }
}
