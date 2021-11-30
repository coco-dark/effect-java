package com.example.singleton;

import java.rmi.AccessException;

public class PrivateClass {
    /**
     * 通过私有构造器来防止工具类实例化
     * 以防篡改
     */
    private PrivateClass() {
        throw new AssertionError("class can't instance");
    }

}
