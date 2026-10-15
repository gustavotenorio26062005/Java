// Exemplo: duas formas de criar threads (estendendo Thread e implementando Runnable)
class ContadorThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
        }
    }
}

class ContadorRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Runnable: " + i);
        }
    }
}

public class Paralelo {
    public static void main(String[] args) {
        new ContadorThread().start();
        new Thread(new ContadorRunnable()).start();
    }
}
