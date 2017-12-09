package moneycalculator.view;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField_amount = new javax.swing.JTextField();
        jComboBox_currencyFrom = new javax.swing.JComboBox<>();
        jComboBox_currencyTo = new javax.swing.JComboBox<>();
        jButton_calculate = new javax.swing.JButton();
        jButton_invert = new javax.swing.JButton();
        jPanel_result = new javax.swing.JPanel();
        jTextPane_currencyAmountFrom = new javax.swing.JTextPane();
        jTextPane_amountTo = new javax.swing.JTextPane();
        jTextPane_currencyTo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MoneyCalculator");
        setMaximumSize(new java.awt.Dimension(550, 150));
        setMinimumSize(new java.awt.Dimension(550, 150));
        setPreferredSize(new java.awt.Dimension(550, 150));
        setResizable(false);

        jButton_calculate.setText("→");
        jButton_calculate.setBorder(null);

        jButton_invert.setText("↔");
        jButton_invert.setBorder(null);
        jButton_invert.setBorderPainted(false);

        jTextPane_currencyAmountFrom.setEditable(false);
        jTextPane_currencyAmountFrom.setBackground(null);
        jTextPane_currencyAmountFrom.setBorder(null);
        jTextPane_currencyAmountFrom.setText("1 USD =");

        jTextPane_amountTo.setEditable(false);
        jTextPane_amountTo.setBackground(null);
        jTextPane_amountTo.setBorder(null);
        jTextPane_amountTo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextPane_amountTo.setText("0,849569");

        jTextPane_currencyTo.setEditable(false);
        jTextPane_currencyTo.setBackground(null);
        jTextPane_currencyTo.setBorder(null);
        jTextPane_currencyTo.setText("EUR");

        javax.swing.GroupLayout jPanel_resultLayout = new javax.swing.GroupLayout(jPanel_result);
        jPanel_result.setLayout(jPanel_resultLayout);
        jPanel_resultLayout.setHorizontalGroup(
            jPanel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextPane_currencyAmountFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPane_amountTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPane_currencyTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_resultLayout.setVerticalGroup(
            jPanel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextPane_amountTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPane_currencyAmountFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPane_currencyTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox_currencyFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_invert, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_currencyTo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jPanel_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_currencyFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_currencyTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_invert, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_calculate;
    private javax.swing.JButton jButton_invert;
    private javax.swing.JComboBox<String> jComboBox_currencyFrom;
    private javax.swing.JComboBox<String> jComboBox_currencyTo;
    private javax.swing.JPanel jPanel_result;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextPane jTextPane_amountTo;
    private javax.swing.JTextPane jTextPane_currencyAmountFrom;
    private javax.swing.JTextPane jTextPane_currencyTo;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getjComboBox_currencyFrom() {
        return jComboBox_currencyFrom;
    }

    public JComboBox<String> getjComboBox_currencyTo() {
        return jComboBox_currencyTo;
    }

    public JButton getjButton_invert() {
        return jButton_invert;
    }

}
