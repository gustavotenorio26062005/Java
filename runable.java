class MinhaTarefa implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executando a tarefa...");
            try {
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class runable {
    public static void main(String[] args) {
        Thread t = new Thread(new MinhaTarefa());
        t.start(); // Inicia a thread
    }
}
