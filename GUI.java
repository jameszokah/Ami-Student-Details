import java.awt.Color;
// import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class GUI extends JFrame implements ActionListener {

  JTextField firstName = new JTextField(20);
    JTextField lastName = new JTextField(20);
    JTextField age = new JTextField(20);
    JTextField yearAdmitted = new JTextField(20);

    JButton submitButton = new JButton();
    
  GUI() {
   
    ImageIcon logo = new ImageIcon("ami-high.png");
    JLabel logoLabel = new JLabel(logo);

    ;

    lastName.setBounds(100, 200, 30, 10);

    JLabel firstNameLabel = new JLabel();
    firstNameLabel.setBounds(60, 150, 30, 10);
    firstNameLabel.setText("First Name: ");

    JLabel lastNameLabel = new JLabel();
    lastNameLabel.setBounds(60, 200, 30, 10);
    lastNameLabel.setText("Last Name: ");

    JLabel ageLabel = new JLabel();
    ageLabel.setBounds(60, 150, 30, 10);
    ageLabel.setText("Age: ");

    JLabel yearAdmittedLabel = new JLabel();
    yearAdmittedLabel.setBounds(60, 150, 30, 10);
    yearAdmittedLabel.setText("Year of Admittion: ");
   
     JPanel panel = new JPanel();
     panel.setBounds(60, 50, 500, 30);
     panel.add(firstNameLabel);
     panel.add(firstName);

     JPanel panel1 = new JPanel();
     // panel1.setBounds(60, 100, 500, 30);
    panel.add(lastNameLabel);
    panel.add(lastName);

    JPanel panel2 = new JPanel();
    panel2.setBounds(60, 150, 500, 30);
    panel2.add(ageLabel);
    panel2.add(age);

    JPanel panel3 = new JPanel();
    panel3.setBounds(60, 200, 500, 30);
    panel3.add(yearAdmittedLabel);
    panel3.add(yearAdmitted);


    submitButton.setText("Submit");
    submitButton.setBounds(250, 300, 150, 30);
    submitButton.setFocusable(false);
    submitButton.setBackground(new Color(50, 205, 50));
    submitButton.setForeground(new Color(255, 255, 255));
    submitButton.addActionListener(this);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(null);
    // mainPanel.add(logoLabel);
    mainPanel.add(panel);
    mainPanel.add(panel1);
    mainPanel.add(panel2);
    mainPanel.add(panel3);
    mainPanel.add(submitButton);


    //JFrame frame = new JFrame();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600, 600);
    this.setTitle("Ami Student Details");
    this.setVisible(true);
    this.add(logoLabel);
    this.add(mainPanel);
  }

  // Handle button events.
   public void actionPerformed(ActionEvent e) {
     if (e.getSource() == submitButton) {

       System.out.println("submit button click !!!");
       System.out.println(firstName.getText());
       System.out.println(lastName.getText());
       System.out.println(age.getText());
       System.out.println(yearAdmitted.getText());
     }
     // this.setVisible(false);
   }


}