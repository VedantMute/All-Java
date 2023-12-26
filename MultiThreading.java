/**
 * MultiThreading
 */
class NumThread extends Thread{
    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Number :"+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class AlphaThread extends Thread{
    public void show(){
        for (char i = 'A'; i < 'E'; i++) {
            System.out.println("Alphabet :"+i);
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        NumThread nt = new NumThread();
        nt.show();
        nt.start();
        AlphaThread at = new AlphaThread();
        at.show();
        at.start();
    }
    
}