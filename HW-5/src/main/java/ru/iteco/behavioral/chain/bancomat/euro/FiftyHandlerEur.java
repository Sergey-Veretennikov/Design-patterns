package ru.iteco.behavioral.chain.bancomat.euro;

import ru.iteco.behavioral.chain.bancomat.Bancomat;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;
import ru.iteco.behavioral.chain.bancomat.banknote.HandlerBase;

/**
 * HundredDollarHandler.
 *
 * @author Ilya_Sukhachev
 */
public class FiftyHandlerEur extends HandlerBase {

    protected int value = 50;

    public FiftyHandlerEur(BanknoteHandler nextHandler, Bancomat bancomat) {
        super(nextHandler, bancomat);
    }

    @Override
    protected CurrencyType getCurrencyType() {
        return CurrencyType.EUR;
    }

    @Override
    protected int getValue() {
        return value;
    }
}