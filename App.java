import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random susNumber = new Random ();
        int num = susNumber.nextInt(6);
        System.out.println("You got a:" + num);
    }
}
