package ThreadDemo;

public class Thread_A extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Luong A : "+i);
        }
    }
}
