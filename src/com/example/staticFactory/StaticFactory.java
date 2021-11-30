package com.example.staticFactory;

public class StaticFactory {
    public enum AnimalType{
        CAT,
        DOG
    }

    public static Animal productAnimal(String name, int age, String color, AnimalType type){
        if (type == AnimalType.CAT) {
            return new Cat(name, color, age);
        }
        return new Dog(name, color, age);
    }

    /**
     * 静态工厂方法 创建对象具有方法名称使得更容易区分所需要创建的对象
     * 避免创建重复的对象 当需要多次创建一个相同的对象时可以考虑使用此方法 可以极大的节省创建对象的成本 提高程序效率
     * 参数类型会随着传入值的变化而变化
     * 他也可以返回原类型的任何子类型的对象
     *
     * 缺点:
     * 没有提供受保护或者公共的构造器就不能被实例化
     * @param args
     */
    public static void main(String[] args) {
        Animal animal = StaticFactory.productAnimal("jack", 18, "red", AnimalType.CAT);
        System.out.println(animal);
    }
}
