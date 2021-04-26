package entity;

/**
 * @author Rosemary
 * @Description 鸭子父类
 * @date 2021/04/26 00:47:39
 */
public class Duck {
    //等用接口实现这个附加功能的时候就不再使用这个方法，因为
    //有些鸭子不会叫谢谢
    public void quack() {
    }

    public void swim() {
    }

    public void display() {
    }
    //等用接口实现这个附加功能的时候就不再使用这个方法，理由同上
    public void fly() {
    }
}
