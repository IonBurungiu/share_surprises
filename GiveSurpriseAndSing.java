package P2;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

    public GiveSurpriseAndSing(IBag bag, int time) {
        super(bag, time);
    }

    @Override
    protected void giveWithpassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…\n");

    }
}