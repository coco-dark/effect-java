package com.example.finallymethod;


import sun.misc.Cleaner;

public class Room implements AutoCloseable {
        private final Cleaner cleaner ;
        private int numJunkPiles;

        public Room(int numJunkPiles) {
            this.numJunkPiles=numJunkPiles;
            cleaner=Cleaner.create(this, () -> {
                System.out.println("Cleaning room");
                this.numJunkPiles = 0;
            });
        }
        @Override
        public void close() {
            cleaner.clean();
        }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public int getNumJunkPiles() {
        return numJunkPiles;
    }

    public void setNumJunkPiles(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }

    public static void main(String[] args) {
        try (Room room1=new Room(11)){
            System.out.println("room clear");
        }//将room对象使用try-with的方式创建 会保证room对象进行关闭操作 控制台将会输出Cleaning room 然后再是 room clear

        //而不正当的操作 就将会使得关闭方法不会调用 资源会一直得不到正确释放 控制台只会输出room clear
        Room room=new Room(10);
        System.out.println("room clear");

    }
}
