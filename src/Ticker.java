public class Ticker implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
