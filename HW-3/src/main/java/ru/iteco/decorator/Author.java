package ru.iteco.decorator;

public enum Author {

    IVANOV_IVAN("1", "Иванов Иван"),
    PUPKIN_OLEG("2", "Пупкин Олег"),
    UNKNOWN_AUTHOR("-1", "Неизвестный автор");

    private final String code;
    private final String name;

    Author(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static Author name(String name) {
        if (name == null) {
            return UNKNOWN_AUTHOR;
        }
        for (Author a : Author.values()) {
            if (name.equals(a.getName()))
                return a;
        }
        return UNKNOWN_AUTHOR;
    }

    public static Author code(String name) {
        if (name == null) {
            return UNKNOWN_AUTHOR;
        }
        for (Author a : Author.values()) {
            if (name.equals(a.getCode()))
                return a;
        }
        return UNKNOWN_AUTHOR;
    }
}
