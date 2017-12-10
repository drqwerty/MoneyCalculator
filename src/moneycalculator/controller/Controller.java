package moneycalculator.controller;

import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencyList;
import moneycalculator.view.MainWindow;

public class Controller {

    private final CurrencyList currencyList;
    private final MainWindow view;
    private JComboBox currencyFrom, currencyTo;
    private String[] currencyListString;
    private Object selectedCurrencyFrom, selectedCurrencyTo;

    public Controller(CurrencyList currencyList, MainWindow view) {
        this.view = view;
        this.currencyList = currencyList;
        initJComboBox();
        execute();
    }

    private void initJComboBox() {
        currencyTo = this.view.getjComboBox_currencyTo();
        currencyFrom = this.view.getjComboBox_currencyFrom();
    }

    private void execute() {
        setOptionsCurrencyFrom();
        setOptionsCurrencyTo();
        saveSelections();
        new Listeners(this, view);
    }

    public void setOptionsCurrencyFrom() {
        currencyFrom.setModel(new DefaultComboBoxModel<>(getCurrencyList()));
    }

    public void setOptionsCurrencyTo() {
        currencyTo.removeAllItems();
        for (int i = 0; i < currencyFrom.getItemCount(); i++) {
            if (currencyFrom.getSelectedItem().equals(currencyFrom.getItemAt(i)))
                continue;
            currencyTo.addItem(currencyFrom.getItemAt(i));
        }
    }

    private String[] getCurrencyList() {
        Map<String, Currency> currencies = currencyList.getCurrencies();
        currencyListString = new String[currencies.size()];
        int i = 0;
        for (Map.Entry<String, Currency> entry : currencies.entrySet())
            currencyListString[i++] = entry.getKey() + " " + entry.getValue().getName();
        return currencyListString;
    }
    
    public void invertCurrency() {
        Object aux = selectedCurrencyFrom;
        currencyFrom.setSelectedItem(selectedCurrencyTo);
        newSelectionCurrencyTo(aux);
    }

    public void changeOptionsCurrencyTo() {
        if (currencyFrom.getSelectedItem().equals(selectedCurrencyTo))
            newSelectionCurrencyTo(selectedCurrencyFrom);
        else newSelectionCurrencyTo(currencyTo.getSelectedItem());
    }

    private void newSelectionCurrencyTo(Object newSelection) {
        setOptionsCurrencyTo();
        currencyTo.setSelectedItem(newSelection);
        saveSelections();
    }

    public void saveSelections() {
        selectedCurrencyFrom = currencyFrom.getSelectedItem();
        selectedCurrencyTo = currencyTo.getSelectedItem();
    }
}
