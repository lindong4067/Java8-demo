package _02_function_interface;

import java.util.function.BinaryOperator;

public class TestClient {
    public static void main(String[] args) {
        long a = 12;
        long b = 34;
        long add = operator(a, b, Operation::add);
        System.out.println(add);
    }
    public static long operator(long a, long b , BinaryOperator<Long> oper){
        long result = oper.apply(a, b);
        return result;
    }
}
