package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

public class DollarBanknote extends Banknote {

    private final int count;

    public DollarBanknote(CurrencyType currency, String value, int count) {
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
