package ru.iteco.behavioral.chain.bancomat.banknote;

import ru.iteco.behavioral.chain.bancomat.Bancomat;
import ru.iteco.behavioral.chain.bancomat.dollar.DollarBanknote;

/**
 * TenRubleHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class HandlerBase extends BanknoteHandler {

    protected HandlerBase(BanknoteHandler nextHandler, Bancomat bancomat) {
        super(nextHandler, bancomat);
    }

    @Override
    public boolean validate(int summa) {
        if (summa <= 0) {
            return false;
        }
        if (summa < getValue()) {
            return super.validate(summa);
        }
        int mod = summa % getValue();
        int div = summa / getValue();
        if (mod == 0) {
            fillBanknotes(div);
            return true;
        }
        fillBanknotes(div);
        return super.validate(summa - div * getValue());
    }

    protected abstract int getValue();

    private void fillBanknotes(int div) {
        super.bancomat.getBanknotes().add(new DollarBanknote(getCurrencyType(), String.valueOf(getValue()), div));
    }

    protected abstract CurrencyType getCurrencyType();

    protected abstract Banknote getBanknote();
}