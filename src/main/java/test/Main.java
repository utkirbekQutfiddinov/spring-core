package test;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Ali",
                "Ilyosbek",
                "Qudratilla",
                "Xusniddin"
        };

        int index = (int) (Math.random() * (names.length ));
        System.out.println(names[index]);
    }
}
