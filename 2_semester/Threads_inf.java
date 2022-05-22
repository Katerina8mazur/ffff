import java.io.IOException;


public class Threads_inf {
    public static void main(String[] args) {
        Thread message = new Thread(() -> {
            while (true) {
                System.out.println("TEST MESSAGE");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread closeMessage = new Thread(() -> {
            while (true) {
                try {
                    int code = System.in.read();
                    if (code == 10) {
                        System.exit(0);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        message.start();
        closeMessage.start();
    }
}