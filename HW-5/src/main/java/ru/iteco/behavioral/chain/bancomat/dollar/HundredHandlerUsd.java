package ru.iteco.behavioral.chain.bancomat.dollar;

import ru.iteco.behavioral.chain.bancomat.Bancomat;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;
import ru.iteco.behavioral.chain.bancomat.banknote.HandlerBase;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class HundredHandlerUsd extends HandlerBase {

    protected int value = 100;

    public HundredHandlerUsd(BanknoteHandler nextHandler, Bancomat bancomat) {
        super(nextHandler, bancomat);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return CurrencyType.USD;
    }

    @Override
    protected int getValue() {
        return value;
    }
}