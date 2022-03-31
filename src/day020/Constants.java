package day020;

public class Constants {
    public static void main(String[] args) {

        // Değişmez değerler -Constant Value-
        // SNAKECASE ile yazarız. camelCase ile değil.
        // Bunlara sonradan başka değer atamaları yapılamaz.
        // final yapıldıysa değişmez hale getirilmişse bundan sonra atama yapılamaz.

        final String BIRTHDAY="03.04.1992";          // Bunlar sınıf blogu içerisinde 'Class Scopunun içinde' tanımlanırsa bütün classda kullanılır.
        final String NAME_SURNAME="Alkan Tuncer";    // Main metot içinde tanımlanırsa sadece o scop içinde kullanılır.
        final double PI=3.14;                        // public static final String BIRTHDAY="03.04.1992";


        int yas=20;
        System.out.println(yas);                                 final int MAX_VALUE=53;
        yas+=5;                                                  final int MIN_VALUE=-53;
        System.out.println(yas);
        yas+=10;
        yas++;
        System.out.println(yas);


        final int MAX_OGRENCI_ADEDI=24;
        String[] ogrenciler=new String[MAX_OGRENCI_ADEDI];
        int[] fizikNotlari=new int[MAX_OGRENCI_ADEDI];


    }
}
