package _02_function_interface;

@FunctionalInterface
public interface Operator {
    public long operator(long a, long b);
}
