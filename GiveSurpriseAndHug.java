package P2;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    public GiveSurpriseAndHug(IBag bag, int time) {
        super(bag, time);
    }

    @Override
    protected void giveWithpassion() {
        System.out.println("Warm wishes and a big hug!\n");

    }
}