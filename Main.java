package P2;

import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {


        System.out.println("\n************     Bun venit!     ************\n\nAplicatia imparte surprize prietenilor tai !!\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Pentru inceput avem nevoie de numarul de surprize dorit, introduceti de la tastatura acest numar:");
        int numar = sc.nextInt();
        System.out.println("Numarul ales este: " + numar);

        if (numar == 1) GatherSurprises.gather().enjoy();
        else GatherSurprises.gather(numar);

        System.out.println("\nStart give all surprise\n");
        Random random = new Random();
        int numberR = random.nextInt(3) % 3;
        // numberR = 1;
        if (numberR == 1) {
            GiveSurpriseAndApplause giveSurprise = new GiveSurpriseAndApplause(GatherSurprises.getGatherS(), 2);
            giveSurprise.giveAll();
        } else if (numar == 2) {
            GiveSurpriseAndHug giveSurprise = new GiveSurpriseAndHug(GatherSurprises.getGatherS(), 2);
            giveSurprise.giveAll();
        } else {
            GiveSurpriseAndSing giveSurprise = new GiveSurpriseAndSing(GatherSurprises.getGatherS(), 2);
            giveSurprise.giveAll();
        }
        sc.close();
    }

}
