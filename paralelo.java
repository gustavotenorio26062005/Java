public class testea  extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
        }
    }
    
}

public class teste extends Thread {
    for(int i=1;i<10;i++){
        System.out.println("Runable: "+);
    }
}
public class paralelo {
    public static void main(String[] args) {
        new  teste().start();
        new Thread(testea()).start();
        
    }
    
}