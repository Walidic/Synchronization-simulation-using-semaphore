import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Network {
    public static void main(String[] args) throws Exception {
        int maxNumOfConnections;
        int numOfDevices;

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the number of WI-FI Connections?");
        maxNumOfConnections = sc.nextInt();
        System.out.println("What is the number of devices Clients want to connect?");
        numOfDevices = sc.nextInt();

        Device devices[] = new Device[numOfDevices];
        Router router = new Router(maxNumOfConnections);

        for (int i = 0; i < numOfDevices; i++) {
            Device tempDevice = new Device(sc.next(), sc.next(), router);
            devices[i] = tempDevice;
        }

        for (int i = 0; i < numOfDevices; i++) {
            devices[i].start();
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (Exception e) {
                System.out.println("Oops! Something went wrong!");
            }
        }
    }
}
