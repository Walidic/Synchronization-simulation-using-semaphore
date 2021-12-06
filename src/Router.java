public class Router {
    private int maxNumOfConnections; // max num of connections allowed
    private int currentConnections;
    private Semaphore semaphore;
    private boolean[] connected;

    public Router(int maxNumOfConnections) {
        this.maxNumOfConnections = maxNumOfConnections;
        currentConnections = 0;
        semaphore = new Semaphore(maxNumOfConnections);
        connected = new boolean[maxNumOfConnections];
    }

    public synchronized int occupyConnection(Device d) {
        for (int i = 0; i < maxNumOfConnections; i++) {
            if (!connected[i]) {
                currentConnections++;
                d.setConnectionID(i + 1);
                connected[i] = true;
                i++;
                return i;
            }
        }
        return 0;
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public void releaseConnection(Device d) {
        currentConnections--;
        connected[d.getConnectionID() - 1] = false;
        System.out.println("Connection " + d.getConnectionID() + ": " + d.getDeviceName() + " Logged out");
        notify();
    }

    public boolean[] getConnected() {
        return connected;
    }

}
