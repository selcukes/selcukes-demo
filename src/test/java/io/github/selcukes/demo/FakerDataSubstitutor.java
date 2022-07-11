package io.github.selcukes.demo;

import io.github.selcukes.databind.substitute.DefaultSubstitutor;

public class FakerDataSubstitutor extends DefaultSubstitutor {
    @Override
    public String replace(String strToReplace, final String format) {
        return FakerUtils.substitute(strToReplace);
    }
}
