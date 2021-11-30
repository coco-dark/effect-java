package com.example.builder;

public class RedBook extends Book{
    private final String color;
    private final String money;
    public static class Builder extends Book.Builder<Builder>{
        private String color;
        private String money;
        public Builder color(String color){
            this.color=color;
            return this;
        }
        public Builder money(String money){
            this.money=money;
            return this;
        }
        public RedBook build(){
            return new RedBook(this);
        }
        @Override
        protected Builder self() {
            return this;
        }
    }
    public RedBook(Builder builder) {
        super(builder);
        this.color=builder.color;
        this.money=builder.money;
    }

    @Override
    public String toString() {
        return "RedBook{" +
                "color='" + color + '\'' +
                ", money='" + money + '\'' +'}';
    }

    public static void main(String[] args) {
        Book book=new RedBook.Builder().color("red").money("500").author("礼拜").name("小数").build();
        System.out.println(book);
    }
}
