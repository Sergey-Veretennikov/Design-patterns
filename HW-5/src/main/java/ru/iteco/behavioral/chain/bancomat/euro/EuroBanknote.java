package ru.iteco.behavioral.chain.bancomat.euro;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

public class EuroBanknote extends Banknote {

    private final int count;

    public EuroBanknote(CurrencyType currency, String value, int count) {
        super(currency, value);
        this.count = count;
    }

    @Override
    public String toString() {
        return "Banknote{" +
                "currency=" + currency +
                ", nominal='" + value + '\'' +
                "count=" + count +
                '}';
    }
}
