package com.example.singleton;

public enum SingleEnum {
    INSTANCE;

    /**
     * 声明一个单一元素的枚举类 也是实现singleTon的一种方法
     * 但是当singleton 需要扩展子类 就不适合用这种方法
     */
    public void leaving(){

    }
}
