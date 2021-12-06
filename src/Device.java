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

    public void setDeviceName(String inputName) {
        this.name = inputName;
    }

    public void SetDeviceType(String inputType) {
        this.type = inputType;
    }

    public void setRouter(Router inputRouter) {
        this.router = inputRouter;
    }

    public void setConnectionID(int ID) {
        this.connectionID = ID;
    }

    public String getDeviceName() {
        return name;
    }

    public String getDeviceType() {
        return type;
    }

    public Router getRouter() {
        return router;
    }

    public int getConnectionID() {
        return connectionID;
    }

    @Override
    public void run() {
        router.getSemaphore().wait(this);
        this.connectionID = router.occupyConnection(this);
        System.out.println("Connection " + this.connectionID + ": " + this.name + " Occupied");
        networkActivity();
        router.releaseConnection(this);
        router.getSemaphore().semaphoreSignal();
    }

    public void networkActivity() {

        System.out.println("Connection " + this.connectionID + ": " + this.name + " Performs online activity");
        Random rand = new Random();
        int n = rand.nextInt(15000);
        try {
            sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
