package com.example.builder;


public abstract class Class {
    private final String classNumber;
    private final String classPerson;
    abstract static class Builder<T extends Builder<T>>{
        private String classNumber;
        private String classPerson;

        public T addClassNumber(String classNumber){
            this.classNumber=classNumber;
            return self();
        }
        public T addClassPerson(String classPerson){
            this.classPerson=classPerson;
            return self();
        }
        abstract Class build();

        protected abstract T self();
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getClassPerson() {
        return classPerson;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classNumber='" + classNumber + '\'' +
                ", classPerson='" + classPerson + '\'' +
                '}';
    }

    public Class(Builder<?> builder){
        this.classNumber=builder.classNumber;
        this.classPerson=builder.classPerson;
    }
}
