public class ThreadsConcorrentes extends Thread {
    String name;

    public ThreadsConcorrentes(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 500; i++) {
            try {
                sleep((long) (Math.random() * 100)); // pausa aleatória
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.print(name);
        }
    }

    public static void main(String[] args) {
        ThreadsConcorrentes t1 = new ThreadsConcorrentes("A");
        ThreadsConcorrentes t2 = new ThreadsConcorrentes("B");

        t1.start();
        t2.start();
    }
}