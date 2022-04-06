package day026;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Çarpım tablosundan hangi sayı kısmını istersiniz? ");
        int sayi= input.nextInt();;

        for (int i = 1; i <=10 ; i++) {
            System.out.print(sayi+"*"+i+"="+(sayi*i)+"\n");
        }


    }
}
