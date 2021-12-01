package com.example.stack;

/**
 * 监听器 和接口回调的方式也可能造成内存泄漏 当用户只注册了api接口 而没有正确的释放点api就可能引发内存泄漏
 */
public class ButtonClickHandler implements ClickHandler{
    public void click(){
        System.out.println("鼠标点击了一下");
    }
}

class Button{
    public void click(ClickHandler clickHandler){
        clickHandler.click();
    }

    public static void main(String[] args) {
        Button button=new Button();
        button.click(new ButtonClickHandler());
    }
}
