package day020;

public class Operators {

    public static int kareAl(int x){
        return x*x;
    }
    public static void main(String[] args) {

        // Aritmetik Operatörler
        // toplama + ,çıkarma - ,çarpma * ,bölme / ,modalma %
        // matematikteki işlem önceliği bu operatörlerde de vardır!

        //operand1 + operand2
        int t=3+5;           // --> Satırın tamamı STATEMENT -- Eşittirden sonrası EXPRESSION
        int x=5;
        int y=3;
        int z=x+y;
        int w=x+48;
        int s=y+kareAl(4);

        System.out.println("t = "+t);
        System.out.println("z = "+z);
        System.out.println("w = "+w);
        System.out.println("s = "+s);

        int kisaKenar=5;
        int uzunKenar=7;
        int cevre=kisaKenar+uzunKenar+kisaKenar+uzunKenar;
        System.out.println("Çevre = "+cevre);

        int a=8;
        int b=3;
        int c=(a+b)*(a-b);
        System.out.println(c);

        int num1=46;
        int num2=90;
        int sum=num1+num2;
        System.out.println(num1+"+"+num2+"="+sum);

        double fahrenheit=95;
        double celsius=5.0/9*(fahrenheit-32);
        System.out.println(celsius);

        convertFahToCel(95);

        double mil=85.0;
        double km=mil*1.609;
        System.out.println(km);

        double radius=5.5;
        double perimeter=2*radius*Math.PI;
        double area=radius*radius*Math.PI;
        System.out.println("Çevre = "+perimeter);
        System.out.println("Alan = "+area);

        int int1=67,int2=45,int3=56;
        double average=(int1+int2+int3)/3.0;
        System.out.println("Ortalama = "+average);



    }

    public static double convertFahToCel(double f){
        double celsius=(f-32)*5/9;
        System.out.println(celsius);
        return celsius;
    }
}


