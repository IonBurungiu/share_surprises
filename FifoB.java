package P2;

import java.util.ArrayList;

class FifoB implements IBag {
    private ArrayList<ISurprise> bag = new ArrayList<>();
    private ISurprise surprise;

    @Override
    public void put(ISurprise newSurprise) {
//        System.out.println("Adaugare surpriza in FIFO");
        bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for (int i = 1; i < bagOfSurprises.size(); i++)
            put(bagOfSurprises.takeOut());
        System.out.println("Fifo put");

    }

    @Override
    public ISurprise takeOut() {
        if (size() > 0) {
            surprise = bag.get(0);
            bag.remove(0);
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
        return this.bag.size();
    }
}
