package day024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UsageOf_IF {
    public static void main(String[] args) {

/*      int x=5;
        int y=20;
        if(x==y){
            System.out.println("X sayısı Y sayısına eşittir.");
        }*/

        int yas1=13;
        if (yas1>=18){
            System.out.println("Kişi yetişkindir.");
        }else{
            System.out.println("Kişi yetişkin değildir.");
        }

        System.out.println();

        int x=20;
        int y=30;
        if (x>y){
            System.out.println("X Y'den büyüktür.");
        }else if (x<y){
            System.out.println("X Y'den küçüktür.");
        }else{
            System.out.println("X Y'ye eşittir.");
        }

        System.out.println();

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz : ");
        int age=input.nextInt();
        if (age>=18){
            System.out.println("Siz yetişkin bir bireysiniz.");
        }else{
            System.out.println("Siz yetişkin bir birey değilsiniz.");
        }


        System.out.print("1.sayıyı giriniz : ");
        int x1=input.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        int x2=input.nextInt();
        if (x1>x2){
            System.out.println("1.sayı 2.sayıdan büyüktür.");
        }else if (x1<x2){
            System.out.println("1.sayı 2.sayıdan küçüktür.");
        }else{
            System.out.println("İki sayı eşittiir.");
        }


        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas=input.nextInt();
        if (yas<13){
            System.out.println("Çocuk");
        }else if(12<yas & yas<18){
            System.out.println("Ergen");
        }else{
            System.out.println("Yetişkin");
        }


    }
}
