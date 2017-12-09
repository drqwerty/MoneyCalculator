package moneycalculator.model;

import java.util.HashMap;
import java.util.Map;

public class CurrencyList {

    private final Map<String, Currency> currencies = new HashMap<>();

    public CurrencyList() {
        add(new Currency("AUD", "Dólar australiano", "$"));
        add(new Currency("BGN", "Leva búlgaro", "лв"));
        add(new Currency("BRL", "Real brasileño", "R$"));
        add(new Currency("CAD", "Dólar canadiense", "$"));
        add(new Currency("CHF", "Franco suizo", "Fr"));
        add(new Currency("CNY", "Yuan, renminbi", "¥, 元"));
        add(new Currency("CZK", "Corona checa", "Kč"));
        add(new Currency("DKK", "Corona danesa", "kr"));
        add(new Currency("EUR", "Euro", "€"));
        add(new Currency("GBP", "Libra esterlina", "£"));
        add(new Currency("HRK", "Kuna croata", "kn"));
        add(new Currency("HUF", "Forinto", "Ft"));
        add(new Currency("IDR", "Rupia indonesia", "Rp"));
        add(new Currency("ILS", "Nuevo séquel", "₪"));
        add(new Currency("INR", "Rupia india", "₹"));
        add(new Currency("JPY", "Yen", "¥"));
        add(new Currency("KRW", "Won surcoreano", "₩"));
        add(new Currency("MXN", "Peso mexicano", "$"));
        add(new Currency("MYR", "Ringit", "RM"));
        add(new Currency("NOK", "Corona noruega", "kr"));
        add(new Currency("NZD", "Dólar de Nueva Zelanda", "$"));
        add(new Currency("PHP", "Peso filipino", "₱"));
        add(new Currency("PLN", "Złóti", "zł"));
        add(new Currency("RON", "Leu rumano", "L"));
        add(new Currency("RUB", "Rublo", "₽"));
        add(new Currency("SEK", "Corona sueca", "kr"));
        add(new Currency("SGD", "Dólar singapurense", "$"));
        add(new Currency("THB", "Bat", "฿"));
        add(new Currency("TRY", "Lira turca", ""));
        add(new Currency("USD", "Dólar estadounidense", "$"));
        add(new Currency("ZAR", "Rand", "R"));
    }

    private void add(Currency currency) {
        currencies.put(currency.getCode(), currency);
    }

    public Currency get(String code) {
        return currencies.get(code.toUpperCase());
    }
}
