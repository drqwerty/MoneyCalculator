package moneycalculator.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencyList;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
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
        initVariables();
        execute();
    }

    private void initVariables() {
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

    public void calculate() {
        try {
            setData(new GetData());
        } catch (Exception ex) {
        }
    }

    class GetData {

        Money money;
        ExchangeRate operation;
        String CurrencyToString;
        
        public GetData() throws Exception {
            Currency currency = currencyList.get(selectedCurrencyFrom.toString().substring(0, 3));
            money = new Money(getAmount(), currency);
            CurrencyToString = selectedCurrencyTo.toString().substring(0, 3);
            operation = getExchangeRate(money.getCurrency(), currencyList.get(CurrencyToString));
        }
        
        private Double getAmount() {
            String amount = view.getjTextField_amount().getText();
            try {
                return Double.parseDouble(amount);
            } catch (Exception e) {
                return null;
            }
        }
        
        public String getCurrencyTo() {
            return operation.getTo().getCode();
        }
        
        public String getCurrencyFrom() {
            if(operation == null) return "";
            String amount = String.valueOf(getAmount());
            String currencyCode = operation.getFrom().getCode();
            return amount + " " + currencyCode + " = ";
        }
        
        public String getRate() {
            if(operation == null) return "Problemas con la conexión";
            return String.valueOf(operation.getRate() * getAmount());
        }
    }
    
    private void setData(GetData data) {
        try {
            view.getjTextPane_currencyAmountFrom().setText(data.getCurrencyFrom());
            view.getjTextPane_amountTo().setText(data.getRate());
            view.getjTextPane_currencyTo().setText(data.getCurrencyTo());
        } catch (Exception ex) {
        }
    }

    private ExchangeRate getExchangeRate(Currency from, Currency to) throws Exception {
        
        Process ping;
        if (System.getProperty("os.name").startsWith("Windows")) {
            ping = java.lang.Runtime.getRuntime().exec("ping -n 1 api.fixer.io");
        } else {
            ping = java.lang.Runtime.getRuntime().exec("ping -c 1 api.fixer.io");
        }
        boolean reachable = (ping.waitFor() == 0);
        if (!reachable) return null;
        
        URL url = new URL("http://api.fixer.io/latest?base=" + from.getCode() + "&symbols=" + to.getCode());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        
        try (BufferedReader reader = new BufferedReader(input)) {
            String line = reader.readLine();
            line = line.substring(line.indexOf(to.getCode()) + 5, line.indexOf("}"));
            return new ExchangeRate(from, to, new Date(), Double.parseDouble(line));
        }
    }
}
