import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI extends JFrame implements ActionListener {

   JTextField firstName = new JTextField("James",20);
    JTextField lastName = new JTextField(20);
    JTextField age = new JTextField(20);
    JTextField yearAdmitted = new JTextField(20);

    JButton submitButton = new JButton();
    
  GUI() {
   
    JLabel firstNameLabel = new JLabel();
    firstNameLabel.setText("First Name: ");

    JLabel lastNameLabel = new JLabel();
    lastNameLabel.setText("Last Name: ");

    JLabel ageLabel = new JLabel();
    ageLabel.setText("Age: ");

    JLabel yearAdmittedLabel = new JLabel();
    yearAdmittedLabel.setText("First Name: ");
   
     JPanel panel = new JPanel();
    panel.add(firstNameLabel);
    panel.add(firstName);

  JPanel panel1 = new JPanel();
    panel1.add(lastNameLabel);
    panel1.add(lastName);

    JPanel panel2 = new JPanel();
    panel2.add(ageLabel);
    panel2.add(age);

    JPanel panel3 = new JPanel();
    panel3.add(yearAdmittedLabel);
    panel3.add(yearAdmitted);


    submitButton.setText("Submit");
    // submitButton.setBackground(Color.grey);




    //JFrame frame = new JFrame();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 400);
    this.setTitle("Ami Student Details");
    this.add(panel);
    this.add(submitButton);
   this.add(panel1);
   this.add(panel2);
   this.add(panel3);
   
   this.setVisible(true);
    
  }

  // Handle button events.
   public void actionPerformed(ActionEvent e) {
      this.setVisible(false);
   }


}