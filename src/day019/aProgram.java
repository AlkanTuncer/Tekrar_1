package day019;

public class aProgram {
    public static void main(String[] args) {

        System.out.println("Selamın Aleyküm Java");
        System.out.println("Aleyküm Selam Dante");
        //Parantez içinde yazdıgımız parametri bir girdidir. Literal diyoruz bu tür girdilere. String bir Literal'dir.

        System.out.println();
        /*
               VARIABLES

               How to DECLARE variables?
                 DataType VariableName;   --> Her veri kendi cinsine büyüklüğüne göre Data Tipine tanımlanır.

               Data Types:
                 Primitive Data Types
                   Integer -> byte , short , int , long /Tam sayılar  1 byte, 2bytes, 4 bytes, 8bytes
                   Floating Point -> float , double /Kesirli sayılar  4 bytes, 8bytes
                   Character -> char /Tek bir karakter tanımlarken  2bytes
                   Boolean -> boolean /True or false 1 byte

         */

        double agirlik=5.0;
        System.out.println(agirlik);
        agirlik=5.3;
        System.out.println(agirlik);

        char ch='A';  // ch=65;  ch=0x41;  --> Hepsi A karakteridir.
        char ch2='T';
        System.out.print(ch);
        System.out.println(ch2);
        char ch3=65;
        char ch4=84;
        System.out.print(ch3);
        System.out.println(ch4);

        int x=53;
        double y=17.0;
        char c='A';
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);

        byte byte1=127;
        short short1=128;
        int integer1=127*128;
        long _long1=integer1*128*127;
        System.out.println(_long1);


    }
}
