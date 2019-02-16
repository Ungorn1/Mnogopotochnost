import java.util.Scanner;

public class Login implements Runnable {

    @Override
    public void run() {
        String name;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            name = scanner.nextLine();
            System.out.println(name);
        }
    }

}
