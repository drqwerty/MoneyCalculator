package moneycalculator.controller;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MainWindow extends javax.swing.JFrame {

    private void initComponents() {
        currencyFrom = new JTextPane();
        amountOutput = new JTextPane();
        currencyTo = new JTextPane();
        selectCurrencyFrom = new JComboBox<>();
        SelectCurrencyTo = new JComboBox<>();
        calculate = new JButton();
        invert = new JButton();
        jPanel_result = new JPanel();
        amountInput = new JTextField();
    }

    private JTextPane currencyFrom, amountOutput, currencyTo;
    private JComboBox<String> selectCurrencyFrom, SelectCurrencyTo;
    private JButton calculate, invert;
    private javax.swing.JPanel jPanel_result;
    private javax.swing.JTextField amountInput;

    public MainWindow() {
        super("Hola");
        initComponents();
    }

    public static void main(String[] a) {
        System.out.println("aaaa");
        new MainWindow().setVisible(true);
    }

}
