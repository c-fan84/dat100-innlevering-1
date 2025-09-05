import java.util.Scanner;

public class O3_Fakultet {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;

        while (true) {

            System.out.print("Skriv inn tall du vil beregne fakultet: ");

            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n > 0 && n < 21){
                    break;
                } else {
                    if (n > 20){
                        System.out.println("Tall over 20 gir feile resultater da \"long\" tall når taket på gyldig verdi.");
                    } else {

                    System.out.println("Tallet må være høyere enn 0.");
                    }
                }
            } else {

                String ikkeTall = in.next();
                System.out.println("Verdien må være et tall.\n\"" + ikkeTall + "\" er ikke gyldig.");

            }

        }
            // bruker long fordi int har for små tall, da klarte den ikke verdier større enn 12
            long fakultet = 1;  // tallet kan ikke være 0 eller mindre
            int i = 1;          // så tar utgangspunkt i verdien 1

            while (i<=n) {

                fakultet = fakultet * i;
                i++;
            }
            System.out.println();
            System.out.println(n + "! = " + fakultet);
        }


    }



