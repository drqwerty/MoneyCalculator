package moneycalculator.controller;

import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencyList;
import moneycalculator.view.MainWindow;

public class Controller {

    private final CurrencyList currencyList;
    private String[] currencyListString1;
    private final MainWindow view;
    private Object selectedItemCurrencyFrom, selectedItemCurrencyTo;

    public Controller(CurrencyList currencyList, MainWindow view) {
        this.currencyList = currencyList;
        this.view = view;
        execute();
        new Listeners(this, view);
    }

    private void execute() {
        setOptionsCurrencyFrom();
        setOptionsCurrencyTo();
    }

    public void setOptionsCurrencyFrom() {
        JComboBox currencyFrom = view.getjComboBox_currencyFrom();
        currencyFrom.setModel(new DefaultComboBoxModel<>(getCurrencyList1()));
        selectedItemCurrencyFrom = currencyFrom.getSelectedItem();
    }

    public void setOptionsCurrencyTo() {
        JComboBox currencyTo = view.getjComboBox_currencyTo();
        currencyTo.setModel(new DefaultComboBoxModel<>(getCurrencyList2()));
        selectedItemCurrencyTo = currencyTo.getSelectedItem();
    }

    private String[] getCurrencyList1() {
        Map<String, Currency> currencies = currencyList.getCurrencies();
        currencyListString1 = new String[currencies.size()];
        int i = 0;
        for (Map.Entry<String, Currency> entry : currencies.entrySet()) {
            currencyListString1[i++] = entry.getKey() + " " + entry.getValue().getName();
        }
        return currencyListString1;
    }

    private String[] getCurrencyList2() {
        String[] currencyListString2 = new String[currencyListString1.length - 1];
        int i = 0;
        for (String currency : currencyListString1) {
            if (view.getjComboBox_currencyFrom().getSelectedItem().equals(currency)) {
                continue;
            }
            currencyListString2[i++] = currency;
        }
        return currencyListString2;
    }

    // TODO dont swap
    public void reverseCurrency() {
        Object aux = view.getjComboBox_currencyFrom().getSelectedItem();
        view.getjComboBox_currencyFrom().setSelectedItem(view.getjComboBox_currencyTo().getSelectedItem());
        saveSelections();
        newSelectionCurrencyTo(aux);
    }

    public void changeOptionsCurrencyTo() {

        Object newSelectedItemCurrentyFrom = view.getjComboBox_currencyFrom().getSelectedItem();
        if (newSelectedItemCurrentyFrom.toString().equals(selectedItemCurrencyTo.toString())) {
            reverseCurrency();
        } else {
            selectedItemCurrencyTo = view.getjComboBox_currencyTo().getSelectedItem();
            newSelectionCurrencyTo(selectedItemCurrencyTo);
        }
        saveSelections();
    }

    private void newSelectionCurrencyTo(Object newSelection) {
        setOptionsCurrencyTo();
        view.getjComboBox_currencyTo().setSelectedItem(newSelection);
    }

    public void saveSelections() {
        selectedItemCurrencyFrom = view.getjComboBox_currencyFrom().getSelectedItem();
        selectedItemCurrencyTo = view.getjComboBox_currencyTo().getSelectedItem();
    }
}
