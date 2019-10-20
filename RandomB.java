package P2;

import java.util.Random;
import java.util.ArrayList;

class RandomB implements IBag {
    private ArrayList<ISurprise> bag = new ArrayList<>();
    private ISurprise surprise;
    private Random random = new Random();

    @Override
    public void put(ISurprise newSurprise) {
      //  System.out.println("Adaugare surpriza in RANDOM");
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for (int i = 1; i < bagOfSurprises.size(); i++)
            put(bagOfSurprises.takeOut());
        System.out.println("Random put all bag");

    }

    @Override
    public ISurprise takeOut() {
        if (size() > 0) {
            int numberR = random.nextInt(size()) % size();
            surprise = bag.get(numberR);
            bag.remove(numberR);
            return surprise;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (size() == 0) return false;
        else return true;
    }

    @Override
    public int size() {
        return bag.size();
    }
}
