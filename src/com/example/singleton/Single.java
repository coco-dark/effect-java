package com.example.singleton;

public class Single {
    private Single(){
    }

    /**
     * 构造器 仅调用一次
     * 构造器私有 外部不能访问
     * 获取对象只能通过提供给外部的静态方法
     *
     * 由于只是实例化了一次 所以保证了对象的全局唯一性
     */
    private static final Single SINGLE=new Single();
    public static Single newInstance() {
        return SINGLE;
    }
}
