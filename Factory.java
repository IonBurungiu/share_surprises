package P2;

public class Factory implements IBagFactory {

    @Override
    public IBag makeBag(String type) {

        if (type.equals("RANDOM")) return new RandomB();
        else if (type.equals("FIFO")) return new FifoB();
        else if (type.equals("LIFO")) return new LifoB();
        else System.out.println("Unknow type.");

        return null;
    }


}





