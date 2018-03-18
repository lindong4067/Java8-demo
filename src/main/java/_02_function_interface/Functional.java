package _02_function_interface;

@FunctionalInterface
public interface Functional {

    void method();
    //需要记住的一件事是：默认方法与静态方法并不影响函数式接口的契约，可以任意使用：
    default void defaultMethod(){

    }
}
