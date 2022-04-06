package day026;

public class Loops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {          // 5 kez dönücek
            for (int j = 0; j < 4; j++) {      // her defasında 4 kez dönücek
                System.out.print("A");       // 20 kez dönmüş olucak.
            }
        }System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("("+i+";"+j+")");
            }
            System.out.println();
        }

        System.out.println();


        // TASKS
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }


        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
