package day022;

public class TypeConversion {
    public static void main(String[] args) {

        System.out.println(7.9+6.7);           // 14.6
        System.out.println((int)7.9+(int)6.7); // 13 --> 0.9 ve 0.7 kayıp oldu
        System.out.println((int)(7.9+6.7));    // 14 --> toplamadan sonra 0.6 kayıp oldu
        System.out.println((double)(17));   // 17.0
        System.out.println((double)(8+3));  // 11.0
        System.out.println((double)(7)/2);  // 3.5
        System.out.println((double)(7/2));  // 3.0 --> işlem sonrası dönüştürme oldugu için kayıp yaşandı. int/int kayıp yaşandı.
        System.out.println((int)(7.8+(double)(15)/2)); // 15 --> işlem sonucu 15.3 ama dönüşüm işlemden sonra oldugu için kayıp yaşandı.

        System.out.println();
        /*
            Byte or Short data types are used in arithmetic expressions, they are temporarily converted to INT values.
            The result of an arithmetic operation using only a mixture of byte, short, or int values will always be an int.
         */
        short sayi1=50;
        short sayi2=60;
        // short toplam=sayi1+sayi2;  Bu hata verir cünkü int'e convert oldu.
        short toplaM=(short)(sayi1+sayi2); // Böyle yapabiliriz cünkü sayılar short hatta byte aralıgındadır, ama kayıp yasayacagımız durumlar olacaktır!
        int toplam=sayi1+sayi2;
        System.out.println(toplaM);
        System.out.println(toplam);


    }
}
