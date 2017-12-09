package moneycalculator;

import moneycalculator.model.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Double.parseDouble;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;
import moneycalculator.model.ExchangeRate;

public class MoneyCalculator {

    public static void main(String[] args) throws Exception {
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        moneyCalculator.execute();
    }

    private final CurrencyList currencyList;
    private Money money;
    private ExchangeRate exchangeRate;
    private Currency currencyTo;

    public MoneyCalculator() {
        this.currencyList = new CurrencyList();
    }

    private void execute() throws Exception {
        input();
        process();
        output();
    }

    private void input() {
        getCurrency(getAmount());
        getCurrencyTo();
    }

    private void process() throws Exception {
        exchangeRate = getExchangeRate(money.getCurrency(), currencyTo);
    }

    private void output() {
        System.out.println(money.getAmount() + " " + money.getCurrency().getSymbol() + " equivalen a " + money.getAmount() * exchangeRate.getRate() + " " + currencyTo.getSymbol());
    }

    private static ExchangeRate getExchangeRate(Currency from, Currency to) throws Exception {
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

    private double getAmount() {
        while (true) {
            System.out.print("Introduzca una cantidad: ");
            try {
                return parseDouble(new Scanner(System.in).next());
            } catch (NumberFormatException e) {
                System.out.println("Cantidad introducida no válida");
            }
        }
    }

    private void getCurrency(double amount) {
        while (true) {
            System.out.print("Introduzca el código de la divisa de origen: ");
            Currency currency = currencyList.get(new Scanner(System.in).next());
            money = new Money(amount, currency);
            if (currency != null) break;
            System.out.println("Divisa no conocida");
        }
    }

    private void getCurrencyTo() {
        while (true) {
            System.out.print("Introduzca el código de la divisa de destino: ");
            currencyTo = currencyList.get(new Scanner(System.in).next());
            if (currencyTo != null) break;
            System.out.println("Divisa no conocida");
        }
    }
}
