package day026;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {

        //Write a Java program to print numbers between, 1 to 100 which are divisible by 3, 5 and by both.
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i = 1; i <=100 ; i++) {
            if (i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for (int i =1 ; i <=100 ; i++) {
            if (i%3==0 & i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // Task-44 from ForLoop.pdf     MPH=KPH*0.6214
        System.out.println("KPH\t\tMPH");
        for (int i = 60; i <=130 ; i+=10) {
           // System.out.println(i+"\t\t"+(i*0.6214));
            System.out.printf("%d\t\t%5.2f\n",i,(i*0.6214));
        }

        System.out.println();

        //Task-45  kullanıcıdan 2 sayı istenir büyük olan yazdırılır. kaç kez dönücegine kullanıcı karar verir. Sayılar eşitse gösterilir.
        Scanner input=new Scanner(System.in);

        System.out.print("Kaç kez işlem yapılacak? ");
        int count=input.nextInt();
        if (count<1){
            System.err.println("En az bir kez işlem yapılmalıdır.");
            System.exit(-1);
        }

        for (int i = 0; i < count; i++) {
            System.out.print("1.sayıyı giriniz : ");
            int number1=input.nextInt();
            System.out.print("2.sayıyı giriniz : ");
            int number2=input.nextInt();
            if (number1>number2){
                System.out.println("1.sayı 2.sayıdan büyüktür.");
            }else if(number2>number1){
                System.out.println("2.sayı 1.sayıdan küçüktür.");
            }else{
                System.out.println("1.sayı ve 2.sayı eşittir.");
            }
            System.out.println();
        }

    }
}
