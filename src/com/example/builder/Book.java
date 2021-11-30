package com.example.builder;

public abstract class Book {
    private final String author;
    private final String name;
    public abstract static class Builder<T extends Builder<T>>{
        private String author;
        private String name;
        public T author(String author){
            this.author=author;
            return self();
        }
        public T name(String name){
            this.name=name;
            return self();
        }
        abstract Book build();

        protected abstract T self();
    }
    public Book(Builder<?> builder){
        this.author=builder.author;
        this.name=builder.name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
