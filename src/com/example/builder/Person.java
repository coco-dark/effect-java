package com.example.builder;

public class Person {
    private final String name;
    private final String hobby;
    private final String addr;
    private final int age;
    private final String chidren;
    private final String company;
    public Person(PersonBuilder personBuilder){
        this.name=personBuilder.name;
        this.hobby=personBuilder.hobby;
        this.addr=personBuilder.addr;
        this.age=personBuilder.age;
        this.chidren=personBuilder.children;
        this.company=personBuilder.company;
    }

    public static class PersonBuilder{
        private String name;
        private String hobby;
        private String addr;
        private int age;
        private String children;
        private String company;
        public PersonBuilder addName(String name){
            this.name=name;
            return this;
        }
        public PersonBuilder addHobby(String hobby){
            this.hobby=hobby;
            return this;
        }
        public PersonBuilder addAddr(String addr){
            this.addr=addr;
            return this;
        }
        public PersonBuilder addAge(int age){
            this.age=age;
            return this;
        }
        public PersonBuilder addChildren(String children){
            this.children=children;
            return this;
        }
        public PersonBuilder addCompany(String company){
            this.company=company;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                ", chidren='" + chidren + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    /**
     * builder模式 适用于多参数对象的创建 当一个类具有多个参数,开发者需要使用不同的参数创建不同的对象时
     * builder模式可以很好帮助开发者准确的创建所需的对象
     * @param args
     */
    public static void main(String[] args) {
        Person person=new Person.PersonBuilder().addAddr("成都市").addAge(12).addHobby("睡觉").build();
        System.out.println(person);
    }
}
