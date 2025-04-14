public class teste extends Thread {
    String name;

    public teste(String name) { // Constructor name should match class name
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 500; i++) {
            try {
                sleep((long) (Math.random() * 100)); // Sleep for a random time
            } catch (InterruptedException ie) {
                ie.printStackTrace(); // Better error handling
            }
            System.out.print(name);
        }
    }

    public static void main(String[] args) {
        teste t1 = new teste("A"); // Creating threads with different names
        teste t2 = new teste("B");

        t1.start(); // Start threads
        t2.start();
    }
}