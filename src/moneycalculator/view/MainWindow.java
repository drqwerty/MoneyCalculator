package moneycalculator.view;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
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
        setMaximumSize(new java.awt.Dimension(400, 150));
        setMinimumSize(new java.awt.Dimension(400, 150));
        setPreferredSize(new java.awt.Dimension(400, 150));
        setResizable(false);

        jTextField_amount.setText("jTextField1");

        jComboBox_currencyFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_currencyTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_calculate.setText("→");

        jButton_invert.setText("↔");
        jButton_invert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_invertActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox_currencyFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton_invert)
                .addGap(24, 24, 24)
                .addComponent(jComboBox_currencyTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton_calculate)
                .addContainerGap())
            .addComponent(jPanel_result, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jButton_calculate)
                    .addComponent(jButton_invert))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_invertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_invertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_invertActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
}
