package com.example.builder;

import java.math.BigDecimal;

public class MyFood extends Food {
    private final BigDecimal money;

    public static class Builder extends Food.FoodBuilder<Builder> {
        private BigDecimal money;

        public Builder addMoney(BigDecimal money) {
            this.money = money;
            return this;
        }

        @Override
        MyFood build() {
            return new MyFood(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private MyFood(Builder builder) {
        super(builder);
        this.money = builder.money;
    }

    @Override
    public String toString() {
        return "MyFood{" +
                "money=" + money +
                ", typeSet=" + typeSet +
                '}';
    }

    public static void main(String[] args) {
        MyFood food= new Builder().addMoney(new BigDecimal("500")).addType(FoodType.CHICKEN).build();
        System.out.println(food);
    }
}
