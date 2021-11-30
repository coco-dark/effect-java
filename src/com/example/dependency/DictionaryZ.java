package com.example.dependency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryZ implements Dictionary{
    private static final String[] word={"w","x","y","z"};

    @Override
    public List<String> word() {
        return new ArrayList<>(Arrays.asList(word));
    }
}
