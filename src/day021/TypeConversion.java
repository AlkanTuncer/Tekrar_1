package day021;

public class TypeConversion {
    public static void main(String[] args) {

        int x=6;
        double d=5.3;
        d=x;  // --> d = 6.0    |  x=d; olmaz cünkü 8bitlik veri 4bite sıgmaz (:
        System.out.println(d);  // x=(int)d; yaparsak 5.6 değerindeki 0.6'yı kaybederiz değer 5 olur.

        // ÜStteki örnek widening conversion örnegidir.
        // Tam tersi durumda narrowing conversion'dır. veri kaybına neden olabilir.
        // The cast operator lets you manually convert a value --> x= (DATA TYPE)y;

        int pies=10,people=4;
        double piesPerson=pies/people;
        System.out.println(piesPerson); // Veri kaybı olur 2.5 olması gerekirken sonuc 2.0 cıkar.

        int pies1=10,people1=4;
        double piesPerson1=(double)pies1/people1;
        System.out.println(piesPerson1);

        int pies2=10,people2=4;
        double piesPerson2=pies2/(double)people2;
        System.out.println(piesPerson2);


        //short 5: 00000000 00000101    Bu durumda veri kaybı olmaz. Byte aralıgından(-128,127) cıkarsak veri kaybı olur.
        //byte 5:           00000101
        short s1=5;
        byte b1=(byte) s1;


    }
}
