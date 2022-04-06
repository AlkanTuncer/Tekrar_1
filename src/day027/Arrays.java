package day027;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        String[] months;
        String[] days;
        double[] weights;

        int[] sayilar;       //Stack'te şu anda bir adres bulunmuyor. null
        sayilar=new int[3];  //Heap'te 3 elemanlı bir nesne oluşturuldu. Bu nesnenin başlangıc adresi Stack'teki sayılar dizisine assign edildi. {0,0,0}
        sayilar[0]=5;
        sayilar[1]=7;
        sayilar[2]=9;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+" ");
        }

        System.out.println();

        // TASKS
        String[] aylar=new String[12];
        String[] monthsName={"January","February","March","April","May","June","July","August","September","October","November","December"};

        Scanner input=new Scanner(System.in);

        int secim;    // DO - WHİLE KULLANIMI
        do {
            System.out.print("Kaçıncı ay [1-12] : ");
            secim = input.nextInt();
        }while(secim<1 | secim>12);

        System.out.println("Sectiğiniz ay "+monthsName[secim-1]);



    }
}
