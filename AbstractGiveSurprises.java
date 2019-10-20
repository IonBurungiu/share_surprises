package P2;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private IBag tolba;
    private int waitTime;
    public AbstractGiveSurprises (IBag bag, int time){
        this.tolba = bag;
        this.waitTime = time;
    }

    public void put(ISurprise newSurprise) {
        this.tolba.put(newSurprise);
    }

    void put(IBag bagOfSurprises) {
        for (int i = 1; i < bagOfSurprises.size(); i++) {
            this.put(bagOfSurprises.takeOut());
        }
    }

    void give() {
        System.out.println("Start metoda give din sing");
        if (this.tolba.size() != 0) {
            this.tolba.takeOut().enjoy();
            giveWithpassion();
        }
    }

    void giveAll() {
        if (isEmpty()) {
            int size = this.tolba.size();

            for (int i = 0; i < size; i++) {
                try {
                    TimeUnit.SECONDS.sleep(this.waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.tolba.takeOut().enjoy();
                giveWithpassion();
                System.out.println("Sleep time is " + this.waitTime + " seconds " + this.tolba.size() + " this.tolba.size()");
                System.out.println(this.tolba.size());
            }
        }
    }

    boolean isEmpty() {
        if (this.tolba.size()!=0) return true;
        return false;
    }

    protected abstract void giveWithpassion();
}
