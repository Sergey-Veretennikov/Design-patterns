package ru.iteco.behavioral.chain.bancomat;

import ru.iteco.behavioral.chain.bancomat.banknote.Banknote;
import ru.iteco.behavioral.chain.bancomat.banknote.BanknoteHandler;
import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;
import ru.iteco.behavioral.chain.bancomat.dollar.FiftyHandlerUsd;
import ru.iteco.behavioral.chain.bancomat.dollar.HundredHandlerUsd;
import ru.iteco.behavioral.chain.bancomat.dollar.TenHandlerUsd;
import ru.iteco.behavioral.chain.bancomat.euro.FiftyHandlerEur;
import ru.iteco.behavioral.chain.bancomat.euro.HundredHandlerEur;
import ru.iteco.behavioral.chain.bancomat.euro.TenHandlerEur;
import ru.iteco.behavioral.chain.bancomat.ruble.FiftyHandlerRub;
import ru.iteco.behavioral.chain.bancomat.ruble.HundredHandlerRub;
import ru.iteco.behavioral.chain.bancomat.ruble.TenHandlerRub;

import java.util.ArrayList;
import java.util.List;

/**
 * Bancomat.
 *
 * @author Ilya_Sukhachev
 */
public class Bancomat {

    private static final String ERROR_OUT = "Невозможно выдать запрашиваемою суммы";
    private static final String AMOUNT = "Запрашиваемая сумма: ";
    private BanknoteHandler handlerRub;
    private BanknoteHandler handlerUsd;
    private BanknoteHandler handlerEur;
    private final List<Banknote> banknotes = new ArrayList<>();

    public Bancomat() {
        newDollarHandler();
    }

    public void giveMoney(String money, CurrencyType currencyType) {
        if (currencyType == CurrencyType.USD) {
            boolean validate = handlerUsd.validate(Integer.parseInt(money));
            System.out.println(AMOUNT + money + " " + currencyType.name());
            System.out.println(validate ? banknotes : ERROR_OUT);
            return;
        }
        if (currencyType == CurrencyType.RUB) {
            boolean validate = handlerRub.validate(Integer.parseInt(money));
            System.out.println(AMOUNT + money + " " + currencyType.name());
            System.out.println(validate ? banknotes : ERROR_OUT);
            return;
        }
        if (currencyType == CurrencyType.EUR) {
            boolean validate = handlerEur.validate(Integer.parseInt(money));
            System.out.println(AMOUNT + money + " " + currencyType.name());
            System.out.println(validate ? banknotes : ERROR_OUT);
        }
    }

    public List<Banknote> getBanknotes() {
        return banknotes;
    }

    private void newDollarHandler() {
        handlerUsd = new TenHandlerUsd(handlerUsd, this);
        handlerUsd = new FiftyHandlerUsd(handlerUsd, this);
        handlerUsd = new HundredHandlerUsd(handlerUsd, this);
        handlerRub = new TenHandlerRub(handlerRub, this);
        handlerRub = new FiftyHandlerRub(handlerRub, this);
        handlerRub = new HundredHandlerRub(handlerRub, this);
        handlerEur = new TenHandlerEur(handlerEur, this);
        handlerEur = new FiftyHandlerEur(handlerEur, this);
        handlerEur = new HundredHandlerEur(handlerEur, this);
    }
}