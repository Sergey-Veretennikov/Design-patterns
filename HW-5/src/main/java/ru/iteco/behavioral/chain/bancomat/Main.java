package ru.iteco.behavioral.chain.bancomat;


import ru.iteco.behavioral.chain.bancomat.banknote.CurrencyType;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {

        Bancomat bancomat = new Bancomat();
        bancomat.giveMoney("130", CurrencyType.RUB);
    }
}
