package moneycalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import moneycalculator.view.MainWindow;

public class Listeners {

    private MainWindow view;
    private Controller controller;

    public Listeners(Controller controller, MainWindow view) {
        this.view = view;
        this.controller = controller;
        addListeners();
    }

    private void addListeners() {
        invertButtonListener();
        selectionCurrencyFrom();
        selectionCurrencyTo();
    }

    private void invertButtonListener() {
        view.getjButton_invert().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.invertCurrency();
            }
        });
    }

    private void selectionCurrencyFrom() {
        view.getjComboBox_currencyFrom().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.changeOptionsCurrencyTo();
            }
        });
    }

    private void selectionCurrencyTo() {
        view.getjComboBox_currencyTo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.saveSelections();
            }
        });
    }
}
