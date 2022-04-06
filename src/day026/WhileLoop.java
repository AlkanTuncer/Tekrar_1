package day026;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int sayac=0;
        while (sayac<5){
            System.out.println((sayac+1)+". Merhaba");
            sayac++;
        }
        System.out.println("Döngüden çıkıldı.");


        Scanner input=new Scanner(System.in);

        while(input.hasNext("[a-zA-Z]+")){
            System.out.println(input.next());
        }

    }
}
