package jay;

import javax.swing.*;
import java.awt.event.*;

public class ElectricityBillingSystem3 {
  private static JTextField customerNameText;
  private static JTextField customerAddressText;
  private static JTextField electricityUnitText;
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Electricity Billing System");
    frame.setSize(800, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel panel = new JPanel();
    frame.add(panel);
    placeComponents(panel);
    
    frame.setVisible(true);
  	}
  
  private static void placeComponents(JPanel panel) {
    panel.setLayout(null);
    
    JLabel customerNameLabel = new JLabel("Customer Name:");
    customerNameLabel.setBounds(10, 10, 120, 25);
    panel.add(customerNameLabel);
    
    customerNameText = new JTextField(20);
    customerNameText.setBounds(140, 10, 165, 25);
    panel.add(customerNameText);
    
    JLabel customerAddressLabel = new JLabel("Customer Address:");
    customerAddressLabel.setBounds(10, 40, 120, 25);
    panel.add(customerAddressLabel);
    
    customerAddressText = new JTextField(20);
    customerAddressText.setBounds(140, 40, 165, 25);
    panel.add(customerAddressText);
    
    JLabel electricityUnitLabel = new JLabel("Electricity Unit:");
    electricityUnitLabel.setBounds(10, 70, 120, 25);
    panel.add(electricityUnitLabel);
    
    electricityUnitText = new JTextField(20);
    electricityUnitText.setBounds(140, 70, 165, 25);
    panel.add(electricityUnitText);
    
    JButton generateBillButton = new JButton("Generate Bill");
    generateBillButton.setBounds(120, 100, 120, 25);
    panel.add(generateBillButton);
    
    generateBillButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String customerName = customerNameText.getText();
        String customerAddress = customerAddressText.getText();
        int electricityUnit = Integer.parseInt(electricityUnitText.getText());
        
        int amount = electricityUnit * 10;
        
        JOptionPane.showMessageDialog(null, "Customer Name: " + customerName + "\nCustomer Address: " + customerAddress + "\nElectricity Unit: " + electricityUnit + "\nAmount: " + amount);
      }
    });
    
    JButton refreshButton = new JButton("Refresh");
    refreshButton.setBounds(250, 100, 120, 25);
    panel.add(refreshButton);
    
    refreshButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        customerNameText.setText("");
        customerAddressText.setText("");
        electricityUnitText.setText("");
      }
    });
  }
}

    
