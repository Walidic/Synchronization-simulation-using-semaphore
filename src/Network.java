
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import javafx.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class Network implements ActionListener  {
    static JFrame frame = new JFrame("netwrok gui");
    public static void main(String[] args) throws Exception {
        
        JPanel panel= new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JButton start = new JButton("start");
        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // TODO Auto-generated method stub
            // create a dialog Box
            JDialog d = new JDialog(frame, "Number of connections");
            
             // create a label
            JLabel l = new JLabel("enter the number of connections ");
            JTextField connectionsText = new JTextField(20);
            d.add(l);
            d.add(connectionsText);
            int maxNumOfConnections=Integer.parseInt(connectionsText.getText());
            //Router router = new Router(maxNumOfConnections);
            // setsize of dialog
            d.setSize(500, 500);

             // set visibility of dialog
            d.setVisible(true);
                
            }});
        //start.addActionListener(this);
        // JLabel connections = new JLabel("Number of Connections: ");
        // JTextField connectionsText = new JTextField(20);
        
        // JLabel devicesLabel = new JLabel("Number of devices: ");
        // JTextField devicesText = new JTextField(20);

        // JLabel devicesDetails = new JLabel("Devices deatails: ");
        // JTextField devicesDetailsText = new JTextField(20);

        // panel.add(connections);
        // panel.add(connectionsText);
        // panel.add(devicesLabel);
        // panel.add(devicesText);
        // panel.add(devicesDetails);
        // panel.add(devicesDetailsText);
        panel.add(start);
        
        
        
        frame.add(panel,BorderLayout.CENTER); // Adds Button to content pane of frame
        frame.pack();
        frame.setVisible(true);
        
        // int maxNumOfConnections;
        // int numOfDevices; 
        // maxNumOfConnections=Integer.parseInt(connectionsText.getText());
        // numOfDevices=Integer.parseInt(devicesText.getText()); 

        // Device devices[] = new Device[numOfDevices];
        // Router router = new Router(maxNumOfConnections);

        // String devicesSpecs = devicesText.getText();
        // String [] devicesSplit = devicesSpecs.split(" ");
        // int j = 0;
        // for (int i = 0; i <= devicesSplit.length -2 ; i=i+2) {
        //     Device tempDevice = new Device(devicesSplit[i], devicesSplit[i+1], router);
        //     devices[j] = tempDevice;
        //     j++;
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("What is the number of WI-FI Connections?");
        // maxNumOfConnections = sc.nextInt();
        // System.out.println("What is the number of devices Clients want to connect?");
        // numOfDevices = sc.nextInt();

        // for (int i = 0; i < numOfDevices; i++) {
        //     devices[i].start();
        //     try {
        //         TimeUnit.MILLISECONDS.sleep(100);
        //     } catch (Exception e) {
        //         System.out.println("Oops! Something went wrong!");
        //     }
        // }

    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // // TODO Auto-generated method stub
        //  // create a dialog Box
        //  JDialog d = new JDialog(frame, "dialog Box");
 
        //  // create a label
        //  JLabel l = new JLabel("this is a dialog box");

        //  d.add(l);

        //  // setsize of dialog
        //  d.setSize(100, 100);

        //  // set visibility of dialog
        //  d.setVisible(true);
        
    }
}
