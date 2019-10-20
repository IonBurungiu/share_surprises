package P2;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

final public class GatherSurprises {
    private static ArrayList<ISurprise> gatherS;
    public static Random randomNumber = new Random();
    private static IBag copyOfBag;


    private GatherSurprises() {
    }

    public static int randomNumber(int i) {

        int n = randomNumber.nextInt(i) % i + 1;
        System.out.println(n);
        return n > 0 ? n : -n;
    }

    public static IBag gather(int n) {

        System.out.println("Alege tipul de tolba din lista urmatoare:\n1.RANDOM\n2.FIFO\n3.LIFO ");
        Scanner sc = new Scanner(System.in);
        String nameOfBag = sc.next();
        Factory newBag = new Factory();
        IBag bag = newBag.makeBag(nameOfBag);

        for (int i = 0; i < n; i++) {
            int numberR = randomNumber.nextInt(3) % 3 + 1;
            System.out.print(i + "  ");
            if (numberR == 1) bag.put(new FortuneCookie());
            else if (numberR == 2) bag.put(new Candies());
            else if (numberR == 3) bag.put(new MinionToy());
        }
        copyOfBag = bag;
        return bag;
    }

    public static ISurprise gather() {
        ISurprise surpriza = null;
        int numberR = randomNumber.nextInt(3) % 3;

        if (numberR == 1) surpriza = new FortuneCookie();
        else if (numberR == 2) surpriza = new Candies();
        else if (numberR == 3) surpriza = new MinionToy();
        return surpriza;
    }

    public static IBag getGatherS() {
        return copyOfBag;
    }
}
