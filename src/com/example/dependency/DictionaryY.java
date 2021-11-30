package com.example.dependency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryY implements Dictionary {
    private static final String[] words={"1","2","3"};
    @Override
    public List<String> word() {
        return new ArrayList<>(Arrays.asList(words));
    }
}
