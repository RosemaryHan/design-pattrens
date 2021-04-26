package entity;

import entity.Duck;
import serve.Flyable;
import serve.Quackable;

/**
 * @author Rosemary
 * @Description 野鸭
 * @date 2021/04/26 00:49:03
 *
 * 单纯操作补充。虽然从继承来说，鸭子的一些可变变量切换成了接口。减少了相关风险
 * 但是从接口分离来说，随着属性的添加或者内容的改变，接口就要向下，可能会引起
 * 其他新的错误
 */
public class MallardDuck extends Duck implements Flyable, Quackable {


    @Override
    public String canFly() {
        return "fly";
    }

    @Override
    public String canQuack() {
        return "quack";
    }
}
