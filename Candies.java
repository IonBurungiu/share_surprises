package P2;

import java.util.Random;

public class Candies implements ISurprise {
    final private String[] choco = {"Chocolate", "Jelly", "Fruits", "Vanilla"};
    public static Random random = new Random();
    private String nameCandies;
    private int numberOfCandies;

    public Candies() {

        int numberR = random.nextInt(4) % 4 + 1;
        if (numberR == 1) nameCandies = choco[0];
        else if (numberR == 2) nameCandies = choco[1];
        else if (numberR == 3) nameCandies = choco[2];
        else if (numberR == 4) nameCandies = choco[3];

        this.numberOfCandies = random.nextInt(10) % 10 + 1;

        System.out.println("S-a creat Candies class: " + this.numberOfCandies + " de " + this.nameCandies);
    }

    @Override
    public void enjoy() {
        System.out.println("Surpriza este: " + this.numberOfCandies + " Candies de " + this.nameCandies);

    }
}
