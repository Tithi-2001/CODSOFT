import java.awt.Font;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Word_counter extends JFrame implements ActionListener {

    JFrame frame;
    JTextArea textArea;
    JLabel labelEnterText;
    JLabel labelTotalWord;
    JButton countButton;
    JButton exitButton;
    JTextField textField;

    Word_counter(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame=new JFrame("Word Counter");
        frame.setSize(600,400);
        frame.setLayout(null);

        labelEnterText=new JLabel();
        labelEnterText.setText("Enter Text:");
        labelEnterText.setBounds(50,50,150,70);
        labelEnterText.setFont(new Font("Arial", Font.BOLD, 20));

        textArea=new JTextArea();
        textArea.setBounds(195,50,300,60);
        textArea.setEditable(true);
        textArea.setFont(new Font("Arial",Font.PLAIN,15));
        textArea.setLineWrap(true);

        countButton=new JButton("COUNT");
        countButton.setBounds(200,140,100,30);
        countButton.addActionListener(this);

        labelTotalWord=new JLabel();
        labelTotalWord.setBounds(50,190,150,70);
        labelTotalWord.setText("Total Words :");
        labelTotalWord.setFont(new Font("Arial", Font.BOLD, 20));

        textField=new JTextField();
        textField.setEditable(false);
        textField.setBounds(195,200,200,50);
        textField.setFont(new Font("Arial",Font.PLAIN,25));
        textField.addActionListener(this);

        exitButton=new JButton("Exit");
        exitButton.setBounds(200,300,70,30);
        // exitButton.addActionListener(this);
        exitButton.addActionListener(e -> {
            // Perform any necessary cleanup or tasks before exiting

            // Exit the application with status code 0
            System.exit(0);
        });

        frame.add(labelEnterText);
        frame.add(textArea);
        frame.add(countButton);
        frame.add(exitButton);
        frame.add(textField);
        frame.add(labelTotalWord);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        String text=textArea.getText();
        text=text.replaceAll("[^a-zA-Z0-9]"," ");
        String[] arr=text.split("\\s+");
        int l=arr.length;
        textField.setText(l+"");
    }
    public static void main(String[] args){
        Word_counter wordcounter=new Word_counter();
    }
}
