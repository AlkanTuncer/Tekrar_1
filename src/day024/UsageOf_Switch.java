package day024;

import java.util.Scanner;

public class UsageOf_Switch {
    public static void main(String[] args) {

        int secim=2;          // secim=1 'de case 1, secim=2 'de case 2, ........ , secim=0 ya da 1-2-3 harici olursa default.
        switch (secim){
            case 1:
                System.out.println("Birinci seçildi.");break;  // case sonlarında 'break' olmazsa eşlesen bir secim ve sonraki bütün soutlar yazdırılır.
            case 2:                                            // o yüzden case aralarında 'break' olmak zorunda.
                System.out.println("İkinci seçildi.");break;
            case 3:
                System.out.println("Üçüncü seçildi.");break;
            default:                                           // bir değer eşleştirmesi olmazsa 'default' çalışır.
                System.out.println("Varsayılan seçim.");break;
        }
        System.out.println();

        // 4 işlem yapabilen bir program
        Scanner input=new Scanner(System.in);

        System.out.println("Dört işlem");
        System.out.println("-".repeat(15));
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("-".repeat(15));

        System.out.print("Seçiminiz : ");
        int secim1=input.nextInt();

        switch (secim1){
            case 1:
                System.out.println("Toplama işlemi");
                System.out.print("Sayı 1: ");
                int sayi1=input.nextInt();
                System.out.print("Sayı2: ");
                int sayi2=input.nextInt();
                int toplam=sayi1+sayi2;
                System.out.println("Toplama işlemi sonucu = "+toplam);
                break;
            case 2:
                System.out.println("Çıkarma işlemi");
                System.out.print("Sayı 1: ");
                int sayi3=input.nextInt();
                System.out.print("Sayı2: ");
                int sayi4=input.nextInt();
                System.out.println("Çıkarma işlemi sonucu = "+(sayi3-sayi4));
                break;
            case 3:
                System.out.println("Çarpma işlemi");
                System.out.print("Sayı 1: ");
                sayi1=input.nextInt();
                System.out.print("Sayı2: ");
                sayi2=input.nextInt();
                System.out.println("Çarpma işlemi sonucu= "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme işlemi");
                System.out.print("Sayı1: ");
                sayi1=input.nextInt();
                System.out.print("Sayı2: ");
                sayi2=input.nextInt();
                System.out.println("Bölme işlemi sonucu= "+((double)sayi1/sayi2));
                break;
            default:
                System.out.println("Geçersiz seçim");break;
        }



    }
}
