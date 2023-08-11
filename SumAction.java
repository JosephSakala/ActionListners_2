import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ActionDemo extends JFrame{

    private JPanel panel;
    private JLabel message;
    private JLabel message2;
    private JButton Button;
    private JTextField field;
    private JTextField field2;
    private final int WIDTH = 300;
    private final int HEIGH = 400;

    public ActionDemo(){
        setTitle("Calculate sum");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGH);



        //call the build method
        buildPanel();



        //add the panel to a window
        add(panel);




        //set windows visibility
        setVisible(true);

        

    }
    public void buildPanel(){

        message = new JLabel("Enter the first number");
        message2 = new JLabel("Enter the second number");
        Button = new JButton("Calculate");
        field = new JTextField(12);
        field2 = new JTextField(12);
        panel = new JPanel();
        panel.setBackground(Color.PINK);
        field.setForeground(Color.pink);
        field2.setForeground(Color.pink);
        message.setForeground(Color.white);
        message2.setForeground(Color.white);

        panel.add(message);
        panel.add(field);
        panel.add(message2);
        panel.add(field2);
        panel.add(Button);
        


    }

    public void setUpButtonListers(){
        
        ActionListener ButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double sum;
                String input1;
                String input2;
                
                input1 = field.getText();
                input2 = field2.getText();
                double FirstNumber;
                FirstNumber = Double.parseDouble(input1);
                double SecondNumber;
                SecondNumber = Double.parseDouble(input2);
                sum = FirstNumber + SecondNumber;

                JOptionPane.showMessageDialog(null, "Your Sum is"+sum);
                



            }
            
        };

        Button.addActionListener(ButtonListener);
    }
}










public class SumAction {

    public static void main(String []args){

        ActionDemo Obj = new ActionDemo();
       Obj.setUpButtonListers();

    }
    
}
