import static java.lang.Thread.sleep;

public class Router {
    private int maxNumOfConnections; // max num of connections allowed
    private int currentConnections;
    private Semaphore semaphore;
    private boolean[] connected;

    public Router(int inputMaxNumOfConnections) {
        this.maxNumOfConnections = inputMaxNumOfConnections;
        currentConnections = 0;
        semaphore = new Semaphore(maxNumOfConnections);
        connected = new boolean[maxNumOfConnections];
        for (int i = 0; i < maxNumOfConnections; i++) {
            connected[i] = false;
        }
    }

    public synchronized void occupyConnection(Device d) {
        int i = 0;
        while (i < maxNumOfConnections) {
            if (!connected[i]) {
                d.setConnectionID(i + 1);
                connected[i] = true;
                currentConnections++;
                break;
            } else {
                i++;
            }
        }
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public synchronized void releaseConnection(Device d) {
        currentConnections--;
        connected[d.getConnectionID() - 1] = false;
        System.out.println("Connection " + d.getConnectionID() + ": " + d.getDeviceName() + " Logged out");
    }

    public boolean[] getConnected() {
        return connected;
    }

}
