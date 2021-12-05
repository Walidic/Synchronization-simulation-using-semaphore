import java.util.List;

public class Semaphore {
    protected int value;
    protected List <Device> process;

    public Semaphore(int inputValue) {value = inputValue;}

    public synchronized void semaphoreWait(){
        value--;
        if (value <0){
            try{wait();} catch (InterruptedException e){}
        }
    }
    public synchronized void semaphoreSignal(){
        value++;
        if (value < 0){
            notify();
        }
    }
}