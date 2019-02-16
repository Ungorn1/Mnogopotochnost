import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        Ticker t = new Ticker();
        Login l = new Login();

        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(t);
        ex.submit(l);

        }

    }

