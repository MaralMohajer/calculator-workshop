//bro code video


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);

        final double[] num1 = {0};
        final double[] num2 = {0};
        final double[] result = {0};
        final char[] operator = new char[1];

        JTextField text = new JTextField();
        text.setBounds(50,25,300,50);


        JButton[] number = new JButton[10];

        JButton add = new JButton("+");
        JButton minus = new JButton("-");
        JButton cross = new JButton("*");
        JButton div = new JButton("/");
        JButton dec = new JButton(".");
        JButton equ = new JButton("=");
        JButton delbutton = new JButton("Delete");
        delbutton.setBounds(44,430,100,50);
        JButton clrButton = new JButton("Clear");
        clrButton.setBounds(154,430,100,50);
        JButton manfiButton = new JButton("_");
        manfiButton.setBounds(264,430,100,50);

        JPanel panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));


        for (int i = 0; i < 10; i++)
        {
            number[i] = new JButton(String.valueOf(i));
        }



        number[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("1"));
            }
        });
        number[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("2"));
            }
        });
        number[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("3"));
            }
        });
        number[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("4"));
            }
        });
        number[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("5"));
            }
        });
        number[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("6"));
            }
        });
        number[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("7"));
            }
        });
        number[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("8"));
            }
        });
        number[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("9"));
            }
        });
        number[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("0"));
            }
        });

        dec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText().concat("."));
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(text.getText());
                operator[0] = '+';
                text.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(text.getText());
                operator[0] = '-';
                text.setText("");
            }
        });
        cross.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(text.getText());
                operator[0] = '*';
                text.setText("");
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1[0] = Double.parseDouble(text.getText());
                operator[0] = '/';
                text.setText("");
            }
        });
        equ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2[0] = Double.parseDouble(text.getText());
                if (operator[0] == '+')
                {
                    result[0] = num1[0] + num2[0];
                }
                else if (operator[0] == '-')
                {
                    result[0] = num1[0] - num2[0];
                }
                else if (operator[0] == '*')
                {
                    result[0] = num1[0] * num2[0];
                }
                else if (operator[0] == '/' && num2[0] !=0)
                {
                    result[0] = num1[0] / num2[0];
                }
                text.setText(String.valueOf(result[0]));
            }
        });

        clrButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        delbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String string = text.getText();
                text.setText(string.substring(0,string.length()-1));
            }
        });










        panel.add(number[1]);
        panel.add(number[2]);
        panel.add(number[3]);
        panel.add(add);
        panel.add(number[4]);
        panel.add(number[5]);
        panel.add(number[6]);
        panel.add(minus);
        panel.add(number[7]);
        panel.add(number[8]);
        panel.add(number[9]);
        panel.add(cross);
        panel.add(dec);
        panel.add(number[0]);
        panel.add(div);
        panel.add(equ);
        frame.add(panel);
        frame.add(delbutton);
        frame.add(clrButton);
        frame.add(manfiButton);
        frame.add(text);
        frame.setVisible(true);

    }
}