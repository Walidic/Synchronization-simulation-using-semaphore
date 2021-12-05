import java.util.List;
import java.util.ArrayList;
public class Router 
{
    int numOfConnections; // max num of connections allowed
    int currentConnections = 0;
    List<Device> connectedDevices = new ArrayList<>();

    public void occupyConnection (Device d) {
        connectedDevices.add(d);
    }
    public void releaseConnection (Device d) {
        connectedDevices.remove(d);
    }

}
