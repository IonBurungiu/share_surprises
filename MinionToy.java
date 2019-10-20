package P2;

public class MinionToy implements ISurprise {
    final private String[] minion = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private String nameMinion;
    static int count = 0;

    public MinionToy() {
        this.nameMinion = minion[this.count];
        int number=count+1;
        System.out.println("S-a creat Minionul numarul: " + number + " pe nume " + this.nameMinion);
        if (count < 5) {
            count++;
        } else {
            count = 0;
        }
    }

    @Override
    public void enjoy() {
        System.out.println("Surpriza este Minionul pe nume " + this.nameMinion);

    }
}
