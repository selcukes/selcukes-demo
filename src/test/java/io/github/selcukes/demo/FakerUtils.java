package io.github.selcukes.demo;

import io.github.selcukes.faker.Faker;
import lombok.experimental.UtilityClass;

import java.util.Locale;

@UtilityClass
public class FakerUtils {
    private static final Faker FAKER = new Faker(new Locale("en-IND"));

    public String substitute(String expression) {
        return FAKER.expression(expression);
    }
}
