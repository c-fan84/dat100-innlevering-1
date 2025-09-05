import java.util.Scanner;

public class O1_Trinnskatt {

    public static void main(String[] args) {

        double brutto;

        int trinn0 = 217400;
        int trinn1 = 306050;
        double skatt1 = 1.7;
        int trinn2 = 697150;
        double skatt2 = 4.0;
        int trinn3 = 942400;
        double skatt3 = 13.7;
        int trinn4 = 1410750;
        double skatt4 = 16.7;
        int trinn5 = 1410751;
        double skatt5 = 17.7;

        Scanner in = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        brutto = in.nextDouble();

        if (brutto <= trinn0) {
            System.out.println("\nDu har bruttoinntekt under skattegrensen, 0 skatt!");
        }
        if (brutto > trinn0 && brutto <= trinn1) {
            System.out.println("\nDu er på Trinn 1 med " + skatt3 +"% skatt.");
            System.out.println(
                    "Med en brutto på " + String.format("%,.2f", brutto) + " blir det "
                            + String.format("%,.2f", ((skatt1 / 100) * brutto )) + " i skatt."
            );
        }
        if (brutto > trinn1 && brutto <= trinn2) {
            System.out.println("\nDu er på Trinn 2 med 4.0% skatt.");
            System.out.println(
                    "Med en brutto på " + String.format("%,.2f", brutto) + " blir det "
                            + String.format("%,.2f", ((skatt2 / 100) * brutto )) + " i skatt."
            );
        }
        if (brutto > trinn2 && brutto <= trinn3) {
            System.out.println("\nDu er på Trinn 3 med 13.7% skatt.");
            System.out.println(
                    "Med en brutto på " + String.format("%,.2f", brutto) + " blir det "
                            + String.format("%,.2f", ((skatt3 / 100) * brutto )) + " i skatt."
            );
        }
        if (brutto > trinn3 && brutto <= trinn4) {
            System.out.println("\nDu er på Trinn 4 med 16.7% skatt.");
            System.out.println(
                    "Med en brutto på " + String.format("%,.2f", brutto) + " blir det "
                            + String.format("%,.2f", ((skatt4 / 100) * brutto )) + " i skatt."
            );
        }
        if (brutto >= trinn5) {
            System.out.println("\nDu er på Trinn 5 med 17.7% skatt.");
            System.out.println(
                    "Med en brutto på " + String.format("%,.2f", brutto) + " blir det "
                            + String.format("%,.2f", ((skatt5 / 100) * brutto )) + " i skatt."
            );
        }
    }
}