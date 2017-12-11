package moneycalculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javafx.scene.input.KeyCode;
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
        calculateButton();
        amount();
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

    private void amount() {
        view.getjTextField_amount().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyCode.ENTER.impl_getCode()) controller.calculate();
            }
        });
    }

    private void calculateButton() {
        view.getjButton_calculate().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.calculate();
            }
        });
    }
}
