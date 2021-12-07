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

public class GUI implements ActionListener 
{
    public GUI()
    {
        JFrame frame = new JFrame("netwrok gui");
        JPanel panel= new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JButton start = new JButton("start");
        start.addActionListener(this);
        JLabel connections = new JLabel("Number of Connections: ");
        JTextField connectionsText = new JTextField(20);
        
        JLabel devices = new JLabel("Number of devices: ");
        JTextField devicesText = new JTextField(20);

        JLabel devicesDetails = new JLabel("Devices deatails: ");
        JTextField devicesDetailsText = new JTextField(20);

        panel.add(connections);
        panel.add(connectionsText);
        panel.add(devices);
        panel.add(devicesText);
        panel.add(devicesDetails);
        panel.add(devicesDetailsText);
        panel.add(start);
        
        
        frame.add(panel,BorderLayout.CENTER); // Adds Button to content pane of frame
        frame.pack();
        frame.setVisible(true);
    }

@Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    // TODO Auto-generated method stub
    
}
}