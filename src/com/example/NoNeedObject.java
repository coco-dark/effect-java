package com.example;

import java.util.Arrays;
import java.util.Collections;

/**
 * 避免创建不必要的对象
 */
public class NoNeedObject {
    private static final String values="message";
    public void subString(){
        /**
         * 这种方式创建string类型的对象 会每次都执行new对象的操作
         * 对于在程序中使用多次不可变值量 应只创建一个对象
         */
        String value = new String("message");
        char c1 = value.charAt(1);

        char c = values.charAt(1);
    }
    public void cast(){
        Integer[] values=new Integer[]{Integer.MAX_VALUE};
        for(int i=0;i<Integer.MAX_VALUE;i++){
            values[i]=i;
        }
        System.out.println(Arrays.asList(values));
        /**
         * 自动装箱的过程会更多的消耗程序执行的资源的和时间 造成不必要的浪费
         *
         * 优先使用基本类型 避免不必要装箱拆箱过程
         */
        int[] values1=new int[]{Integer.MAX_VALUE};
        for(int j=0;j<Integer.MAX_VALUE;j++){
            values1[j]=j;
        }
        System.out.println(Collections.singletonList(values1));
    }
}
