package ru.iteco.builder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Email email = new EmailBuilder()
                .addSubject("qwerty")
                .addFrom()
                .addTo("ew")
                .addToAll(Arrays.asList("qwe", "qaz"))
                .copyTo("ooi")
                .copyToAll(Arrays.asList("qwe", "qaz"))
                .addContent("qwwertyy")
                .build();

        System.out.println(email);
    }
}
