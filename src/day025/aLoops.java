package day025;

public class aLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {  // 0 1 2 3 4 - 5 kez döner.
            System.out.println(i+". Merhaba");
        }

        for (int i = 1; i <=15 ; i=i+2) {
            System.out.println(i+". SA");
        }
        System.out.println();


        // 1-15 arası sayıların toplamı nedir?
        int toplam=0;                                // toplam blok dışında tanımlanır çünkü blok dışında ihtiyaca var toplama yazdırmak için
        for (int i = 1; i <=15 ; i++) {              // for bloğu içinde tanımlarsak dısında kullanamayız.
            toplam=toplam+i;  // toplam+=i;
        }
        System.out.println("Toplam = "+toplam);

        for (int i = 15; i > 0 ; i--) {              // tersten döngü 15'ten 0'a kadar. 0 dahil değil sayıları gösteriyor.
            System.out.print(i+" ");
        }
        System.out.println();


        // TASKS
        // 1'den 100'e kadar olan çift sayıları aynı satırda gösteriniz.
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        // 5-140 arasındaki tek sayıları yazdırın.
        for (int i = 5; i <140 ; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        // 2'den 10'a kadar olan sayıların carpımını bulan java kodu yazınız.
        int carpim=1;
        for (int i = 2; i <=10 ; i++) {
            carpim*=i;
        }
        System.out.println("Çarpım = "+carpim);

        // Çift ve tek sayıların toplamlarını gösteren java programı yaz. 1-100 arası. 100 dahil değil
        int sumOfOdd=0;
        int sumOfEven=0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                sumOfEven+=i;
            }else{
                sumOfOdd+=i;
            }
        }
        System.out.println("Çift Sayılar Toplamı = "+sumOfEven);
        System.out.println("Tek Sayılar Toplamı = "+sumOfOdd);

        // 1 den 10 a kadar olan sayıların kendılerını ve karelerını ekranda gösteren tablo yapın.
        System.out.println("Number\tSquared");
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i+"\t\t"+(i*i));
        }

        System.out.println("Number\tSquared");  // Üsttekinin String.format la yazılmış hali. Bu yazım daha uygun.
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d\t\t%d\n",i,i*i);
        }
    }
}
