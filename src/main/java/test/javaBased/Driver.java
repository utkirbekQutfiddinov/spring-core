package test.javaBased;

public class Driver implements Person{

    public Driver() {
        System.out.println("Driver Created");
    }

    @Override
    public void work() {
        System.out.println("Driver is working");
    }
}
