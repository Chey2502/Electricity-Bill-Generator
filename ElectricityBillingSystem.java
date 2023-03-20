package jay;
import javax.swing.*;
import java.awt.*;

public class ElectricityBillingSystem {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Electricity Billing System");
    frame.setSize(400, 200);
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
    
    JTextField customerNameText = new JTextField(20);
    customerNameText.setBounds(140, 10, 165, 25);
    panel.add(customerNameText);
    
    JLabel customerAddressLabel = new JLabel("Customer Address:");
    customerAddressLabel.setBounds(10, 40, 120, 25);
    panel.add(customerAddressLabel);
    
    JTextField customerAddressText = new JTextField(20);
    customerAddressText.setBounds(140, 40, 165, 25);
    panel.add(customerAddressText);
    
    JLabel electricityUnitLabel = new JLabel("Electricity Unit:");
    electricityUnitLabel.setBounds(10, 70, 120, 25);
    panel.add(electricityUnitLabel);
    
    JTextField electricityUnitText = new JTextField(20);
    electricityUnitText.setBounds(140, 70, 165, 25);
    panel.add(electricityUnitText);
    
    JButton generateBillButton = new JButton("Generate Bill");
    generateBillButton.setBounds(250, 100, 120, 25);
    panel.add(generateBillButton);
  }
}
