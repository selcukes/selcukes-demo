package io.github.selcukes.demo;

import io.github.selcukes.databind.substitute.StringSubstitutor;

public class FakerDataSubstitutor extends StringSubstitutor {
    @Override
    public String replace(String strToReplace, final String format) {

        return FakerUtils.substitute(strToReplace);
    }
}
