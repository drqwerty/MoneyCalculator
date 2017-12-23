package moneycalculator;

import moneycalculator.model.*;
import moneycalculator.controller.Controller;
import moneycalculator.view.Display;

public class MoneyCalculator {

    public static void main(String[] args) {
//        MainWindow view = new MainWindow();
        CurrencyList currencyList = new CurrencyList();
//        Controller controller = new Controller(currencyList);
//        controller.setView(view);

        Controller controller = new Controller(currencyList);
        Display display = new Display();
        controller.setDisplay(display);
        display.setController(controller);
        display.setItemsComboBox();
        display.setVisible(true);
    }
}
