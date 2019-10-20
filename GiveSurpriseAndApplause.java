package P2;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(IBag bag, int time) {
        super(bag, time);
    }

    @Override
    protected void giveWithpassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive\n");

    }
}
