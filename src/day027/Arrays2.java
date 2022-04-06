package day027;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        //Günler dizisi oluşturunuz.
        //Kullanıcıdan aradıgı adıyla günü isteyiniz
        //Dizi içerisinde arayınız
        //Bulunca döngüyü kırınız
        //Döngüden çıkınca aradıgınız gün bulundu mesajı veriniz.

        Scanner input = new Scanner(System.in);

        String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};

        System.out.print("Aradığınız gün : ");
        int gunNo=-1;
        String gun = input.next();

        for (int i = 0; i < gunler.length; i++) {
            if (gun.equalsIgnoreCase(gunler[i])){
                gunNo=i+1;
                break;
            }
        }
        if (gunNo>0) System.out.println("Gün bulundu. ["+gunNo+"]");

    }
}
