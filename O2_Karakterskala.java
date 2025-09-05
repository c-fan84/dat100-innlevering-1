import java.util.Scanner;

public class O2_Karakterskala {

    public static void main(String[] args) {

        int[] karA = {90, 100};
        int[] karB = {80, 89};
        int[] karC = {60, 79};
        int[] karD = {50, 59};
        int[] karE = {40, 49};
        int[] karF = {0, 39};

        int poengsum;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            while (true) {
                System.out.print("Skriv inn poengsum på student " + (i+1) +": ");

                if (in.hasNextInt()) {
                    poengsum = in.nextInt();

                    if (poengsum >= 0 && poengsum <= 100){
                        break;
                    } else {

                        System.out.println("Verdien oppgitt er ugyldig, poengsum skal være fra 0 til 100.");
                    }
                } else {

                    String ikkeTall = in.next();
                    System.out.println("Verdien må være et tall.\n\"" + ikkeTall + "\" er ikke gyldig.");

                }
            }

                if (poengsum >= karA[0]) {
                    System.out.println("Dine " + poengsum + " poeng gir karakteren: A");
                }
                if (poengsum >= karB[0] && poengsum <= karB[1]) {
                    System.out.println("Dine " + poengsum + " poeng gir karakteren: B");
                }
                if (poengsum >= karC[0] && poengsum <= karC[1]) {
                    System.out.println("Dine " + poengsum + " poeng gir karakteren: C");
                }
                if (poengsum >= karD[0] && poengsum <= karD[1]) {
                    System.out.println("Dine " + poengsum + " poeng gir karakteren: D");
                }
                if (poengsum >= karE[0] && poengsum <= karE[1]) {
                    System.out.println("Dine " + poengsum + " poeng gir karakteren: E");
                }
                if (poengsum <= karF[1]) {
                    System.out.println("Dine " + poengsum + " poeng gir karakteren: F");
                }
        }

        in.close();

    }
// sd
}
