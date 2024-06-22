package test.javaBased;

public class Teacher implements Person{
//    private Passport


    public Teacher() {
        System.out.println("Teacher has been created");
    }

    @Override
    public void work() {
        System.out.println("Teacher is teaching");
    }
}
