package com.example.dependency;

public class Dependencies {
    private final Dictionary dictionary;

    public Dependencies(Dictionary dictionary) {
        this.dictionary = dictionary;
    }
    public boolean check(String word){
        return this.dictionary.word().contains(word);
    }

    /**
     * （依赖倒转原则）
     * 使用细节依赖抽象 而抽象依赖字节
     * 对于后续代码的扩展性的延伸性 有着重要的提升
     * 同样静态工厂方法也同样适用于依赖倒转
     * 不要用singleton 和静态工具方法 来实现一个或者多个依赖底层资源的类
     * @param args
     */
    public static void main(String[] args) {
        Dependencies dependencies=new Dependencies(new DictionaryY());
        boolean check = dependencies.check("w");
        System.out.println(check);
        //静态工厂方法实现依赖倒转原则
        Dictionary dictionary = DictionaryFactory.getDictionary(DictionaryY::new);
        System.out.println(dictionary);
    }
}
