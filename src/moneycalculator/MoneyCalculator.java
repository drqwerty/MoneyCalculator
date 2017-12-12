package moneycalculator;

import moneycalculator.model.*;
import moneycalculator.controller.Controller;
import moneycalculator.view.MainWindow;

public class MoneyCalculator {

    public static void main(String[] args) {
        MainWindow view = new MainWindow();
        CurrencyList currencyList = new CurrencyList();
        Controller controler = new Controller(currencyList, view);
    }
}
