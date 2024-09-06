package Practica2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla1 {
    private JTextField txtfldnum1;
    private JTextField txtfldnum2;
    private JButton btnsumar;
    private JButton btnrestar;
    private JButton btnmultiplicar;
    private JButton btndividir;
    private JButton btnborrar;
    private JPanel PanelPantalla1;


    public Pantalla1() {
        btnsumar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Integer.parseInt(txtfldnum1.getText());
                double num2 = Integer.parseInt(txtfldnum2.getText());
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1+ num2));
            }
        });
        btnborrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfldnum1.setText("");
                txtfldnum2.setText("");
            }
        });
        btnrestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Integer.parseInt(txtfldnum1.getText());
                double num2 = Integer.parseInt(txtfldnum2.getText());
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1 - num2));
            }
        });
        btnmultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Integer.parseInt(txtfldnum1.getText());
                double num2 = Integer.parseInt(txtfldnum2.getText());
                JOptionPane.showMessageDialog(null, "El resultado es: " + (num1 * num2));
            }
        });
        btndividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Integer.parseInt(txtfldnum1.getText());
                double num2 = Integer.parseInt(txtfldnum2.getText());
                JOptionPane.showMessageDialog(null, "El resultado es: " + String.format("%.2f", (num1 / num2)));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pantalla de operaciones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setContentPane(new Pantalla1().PanelPantalla1);
        frame.setBounds(30,30,700,700);
        frame.pack();
        frame.setVisible(true);
    }
}


