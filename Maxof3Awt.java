import java.awt.*;
import java.awt.event.*;

public class Maxof3Awt extends Frame implements ActionListener {
    // creating instances of TextField and Button class
    Label L1, res;
    TextField tf1, tf2, tf3;
    Button b1;

    // instantiating using constructor
    Maxof3Awt() {

        L1 = new Label("3 numbers");
        L1.setBounds(65, 50, 80, 30);
        res = new Label("");
        res.setBounds(65, 200, 80, 30);

        tf1 = new TextField();
        tf1.setBounds(150, 50, 150, 30);
        tf2 = new TextField();
        tf2.setBounds(150, 100, 150, 30);
        tf3 = new TextField();
        tf3.setBounds(150, 150, 150, 30);

        b1 = new Button("Find");
        b1.setBounds(50, 250, 80, 35);
        // adding action listener
        b1.addActionListener(this);
        // adding components to frame
        add(L1);
        add(res);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        // setting size, layout and visibility of frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });   
    }

    // defining the actionPerformed method to generate an event on buttons
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == b1) {
            int a = Integer.parseInt(tf1.getText());
            int b = Integer.parseInt(tf2.getText());
            int c = Integer.parseInt(tf3.getText());
            int val = a;
            if (val < b)
                val = b;
            if (val < c)
                val = c;
            res.setText("Maximum " + val);
        }
    }

    // main methods
    public static void main(String args[]) {
        new Maxof3Awt();
    }
}