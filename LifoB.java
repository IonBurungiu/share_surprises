package P2;

import java.util.ArrayList;

class LifoB implements IBag {

    private ArrayList<ISurprise> bag = new ArrayList<>();
    private ISurprise surprise;

    @Override

    public void put(ISurprise newSurprise) {
//        System.out.println("Adaugare surpriza in LIFO");
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for (int i = 1; i < bagOfSurprises.size(); i++)
            put(bagOfSurprises.takeOut());
        System.out.println("Lifo put all bag");

    }

    @Override
    public ISurprise takeOut() {
        if (size() > 0) {
            surprise = bag.get(size()-1);
            bag.remove(size()-1);
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
