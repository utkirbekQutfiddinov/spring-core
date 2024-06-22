package test.xmlbased;

public class BenzinEngine implements Engine{

    public BenzinEngine() {
        System.out.println("enggggg");
    }

    @Override
    public void start() {
            System.out.println("benzin engine is started");
    }
}
