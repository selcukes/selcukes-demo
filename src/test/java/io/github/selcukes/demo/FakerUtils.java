package io.github.selcukes.demo;

import io.github.selcukes.faker.Faker;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FakerUtils {
    private static final Faker FAKER = new Faker();

    public String substitute(String expression) {
        return FAKER.expression(expression);
    }

}
