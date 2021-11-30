package com.example.builder;

public class FirstClass extends Class{
    private final String className;
    public static class Builder extends Class.Builder<Builder>{
        private String name;
        public Builder addName(String name){
            this.name=name;
            return this;
        }
        @Override
        FirstClass build() {
            return new FirstClass(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "className='" + className + '\'' +
                '}';
    }

    public FirstClass(Builder builder) {
        super(builder);
        this.className=builder.name;
    }

    public static void main(String[] args) {
        FirstClass c=new FirstClass.Builder().addName("1班").addClassNumber("12").addClassPerson("小王").build();
        System.out.println(c);
        System.out.println(c.getClassPerson());
    }
}
