package ru.iteco.behavioral.chain.bancomat.ruble;

import ru.iteco.behavioral.chain.bancomat.Bancomat;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;
import ru.iteco.behavioral.chain.bancomat.banknote.HandlerBase;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class HundredHandlerRub extends HandlerBase {

    protected int value = 100;

    public HundredHandlerRub(BanknoteHandler nextHandler, Bancomat bancomat) {
        super(nextHandler, bancomat);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return CurrencyType.RUB;
    }

    @Override
    protected int getValue() {
        return value;
    }
}