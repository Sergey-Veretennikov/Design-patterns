package ru.iteco.behavioral.chain.bancomat.banknote;

import ru.iteco.behavioral.chain.bancomat.Bancomat;

/**
 * BanknoteHandler.
 *
 * @author Ilya_Sukhachev
 */
public abstract class BanknoteHandler {

    private BanknoteHandler nextHandler;
    protected final Bancomat bancomat;

    protected BanknoteHandler(BanknoteHandler nextHandler, Bancomat bancomat) {
        this.nextHandler = nextHandler;
        this.bancomat = bancomat;
    }

    public boolean validate(int summa) {
        return nextHandler != null && nextHandler.validate(summa);
    }
}