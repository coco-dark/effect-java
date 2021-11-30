package com.example.dependency;

import java.util.function.Supplier;

public class DictionaryFactory{
    /**
     * 通过supplier 工厂方法来获取所需对象
     * @param factory
     * @return
     */
    public static Dictionary getDictionary(Supplier<? extends Dictionary> factory){
        return factory.get();
    }
}
