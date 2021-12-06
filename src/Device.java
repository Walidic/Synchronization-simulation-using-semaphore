import java.util.Random;

public class Device extends Thread {
    private String name;
    private String type;
    private Router router;
    private int connectionID;

    public Device(String name, String type, Router router) {
        this.setDeviceName(name);
        this.SetDeviceType(type);
        this.setRouter(router);
    }

    public synchronized void setDeviceName(String inputName) {
        this.name = inputName;
    }

    public synchronized void SetDeviceType(String inputType) {
        this.type = inputType;
    }

    public synchronized void setRouter(Router inputRouter) {
        this.router = inputRouter;
    }

    public synchronized void setConnectionID(int ID) {
        this.connectionID = ID;
    }

    public synchronized String getDeviceName() {
        return name;
    }

    public synchronized String getDeviceType() {
        return type;
    }

    public synchronized Router getRouter() {
        return router;
    }

    public synchronized int getConnectionID() {
        return connectionID;
    }

    @Override
    public synchronized void run() {
        router.getSemaphore().wait(this);
        router.occupyConnection(this);
        System.out.println("Connection " + getConnectionID() + ": " + this.name + " Occupied");
        networkActivity();
        router.releaseConnection(this);
        router.getSemaphore().semaphoreSignal();
    }

    public synchronized void networkActivity() {

        System.out.println("Connection " + getConnectionID() + ": " + this.name + " Performs online activity");
        Random rand = new Random();
        int n = rand.nextInt(15000);
        try {
            sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
