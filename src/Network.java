import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Network extends Application {
    static public int maxNumOfConnections;
    static public int numOfDevices;

    @Override
    public void start(Stage stage) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Java Synchronization");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // System.out.println("What is the number of WI-FI Connections?");
        // maxNumOfConnections = sc.nextInt();
        // System.out.println("What is the number of devices Clients want to connect?");
        // numOfDevices = sc.nextInt();

        launch(args);
        Device devices[] = new Device[numOfDevices];
        Router router = new Router(maxNumOfConnections);

        for (int i = 0; i < numOfDevices; i++) {
            Device tempDevice = new Device(sc.next(), sc.next(), router);
            devices[i] = tempDevice;
        }

        for (int i = 0; i < numOfDevices; i++) {
            devices[i].start();
            // try {
            // TimeUnit.MILLISECONDS.sleep(100);
            // } catch (Exception e) {
            // System.out.println("Oops! Something went wrong!");
            // }
        }
    }
}
