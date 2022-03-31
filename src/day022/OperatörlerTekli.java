package day022;

public class OperatörlerTekli {
    public static void main(String[] args) {
        //00000000 00000000 00000000 00000000   int 4 byte 32 bit
        int x=-7;
        int y=+3;
        int z=x+1; // x'in değeri değişmez -7 dir.
        System.out.println(x);
        System.out.println("z->"+z);

        x++; // x=-6 olur.  x++; incremental statement   x++; --> x=x+1;
        y--; // y=2 olur. Bu bir statement'dır, expression değildir. En sonunda assignment yapılır.
        System.out.println(x);
        System.out.println(y);

        System.out.println();

        /*
                 --x or ++x  >PRE
                 x-- or x++  >POST
            1. ++ ve -- operatörleri değişkenlerin solunda veya sağında kullanılabilir.
            2. Solda olursa PREFIX adı verilir. Sağda kullanılırsa POSTFIX yada SUFFIX adı verilir.
            3. Birlikte kullanıldığı değişkenin değerini HER DURUMDA '++' birim artırır, '--' bir birim azaltır.
            4. Prefix '++x' kullanılırsa önce değer artar sonra işleme girer.
            5. Postfix 'x++' olursa önce işleme girer sonra değer artar.
            6. Expression içerisinde nerde kullanıldıgı önemli prefix ve postfixin.
         */

        int a=3;
        int b=2;
        int c=a+b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a+b = "+c);
        int d=++a+b;                           // ++a önce değer artar sonra işleme girer.
        System.out.println("a = "+a);
        System.out.println("a+b = "+d);

        int q=7;
        System.out.println("q = "+q);
        int t=q++ +b;                          // q++ sonra değer artar önce işleme girer.
        System.out.println("q = "+q);
        System.out.println("q+b = "+t);

        System.out.println();
        int xA=2;
        int yA=xA++;
        System.out.println(yA);// y=2 dir cünkü x'in değeri işlemden sonra artmıştır. POSTFIX'dir.
        System.out.println(xA++);

        System.out.println();

        int k=50;                     // ilkinde değer 49'a düştü. ikincisi 49.(Çünkü ilkinde a 49 oldu ve hafızada 49)
        k= --k + k++ + k-- + k++;     // 49+49+49+49=196 + işlem sonrasında iki tane +1 bir tane -1 olucak ve a=196+1-1+1=197.
        System.out.println(k);

        int o=1;
        o= -o-- + o++ / -o-- * --o;
        System.out.println(o);



    }
}
