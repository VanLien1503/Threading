package synchronizedinjava;

import java.util.jar.JarOutputStream;

public class Table {
    public synchronized void displayTable(int n){
        System.out.println("Chạy từng luồng");
        for (int i=1;i<5;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
