package com.hillel.calculatorspringshell;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ValueService {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    public List<Double> giveTheList(){
        return Arrays.stream(value.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
    }
}
