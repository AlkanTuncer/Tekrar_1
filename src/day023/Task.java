package day023;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        /*
                Klavyeden 5 karakterlik bir mesaj girişi yapılacak.
                Elde edilen mesajın karakterleri bir anahtar (7) ile şifrelenecek
                şifrelenen mesaj ekranda gösterilecek
         */

        Scanner input=new Scanner(System.in);

        System.out.print("5 Karakterli bir mesaj giriniz : ");

        String mesaj=input.next();

        char x1=mesaj.charAt(0);
        char x2=mesaj.charAt(1);
        char x3=mesaj.charAt(2);
        char x4=mesaj.charAt(3);
        char x5=mesaj.charAt(4);

        int key=7;

        char sifre1=(char)(x1^key);
        char sifre2=(char)(x2^key);
        char sifre3=(char)(x3^key);
        char sifre4=(char)(x4^key);
        char sifre5=(char)(x5^key);

        System.out.print(sifre1);
        System.out.print(sifre2);
        System.out.print(sifre3);
        System.out.print(sifre4);
        System.out.print(sifre5);

    }
}