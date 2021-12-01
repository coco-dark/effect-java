package com.example.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    /**
     * 消除不必要的对象引用
     * 像此类型的压栈和入栈操作(实际上数组中所存在的对象一直存在 垃圾回收机制并不会检测到数据数组不活动的对象是否为有效对象 从而不进行回收)
     * 这样的方式 极容易造成内存泄漏 引发程序崩溃问题
     * 对象的缓存也极易引起内存泄漏
     */
    private Object[] elements;
    private int size;
    private static final int DEFAULT_SIZE=16;
    public Stack(){
        this.elements=new Object[]{DEFAULT_SIZE};
    }
    public void push(Object o){
        increment();
        elements[size++]=o;
    }
    public Object pop(){
        if(size==0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }
    private void increment(){
        if(elements.length==size) elements= Arrays.copyOf(elements,elements.length*2);
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push("value");
        Object pop = stack.pop();
        System.out.println(pop);
        System.out.println(stack);
    }

}
