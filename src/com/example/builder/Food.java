package com.example.builder;

import java.util.EnumSet;
import java.util.Set;

public abstract class Food {
    /**
     * 使用抽象类 来实现对于builder模式的多态的实现
     * T 泛型是继承父类的builder 在添加参数操作之后 返回当前类型或者子类型对象
     * 使得子类同时具有父类的builder操作的同时可以实现自身的builder参数传递
     * 这种递归类型的参数 省去了子类向上转型
     * @param <T>
     */
    abstract static class FoodBuilder<T extends FoodBuilder<T>> {
        EnumSet<FoodType> types = EnumSet.noneOf(FoodType.class);

        public T addType(FoodType type) {
            types.add(type);
            return self();
        }

        abstract Food build();

        protected abstract T self();
    }

    public enum FoodType {
        FRUIT,
        ORIGIN,
        CHICKEN
    }

    final Set<FoodType> typeSet;

    Food(FoodBuilder<?> builder) {
        this.typeSet = builder.types;
    }
}
