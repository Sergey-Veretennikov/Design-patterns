package ru.iteco.behavioral.chain.bancomat.ruble;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

public class RubleBanknote extends Banknote {

    private final int count;

    public RubleBanknote(CurrencyType currency, String value, int count) {
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