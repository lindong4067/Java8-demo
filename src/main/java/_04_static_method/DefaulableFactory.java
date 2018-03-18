package _04_static_method;

import _03_default_method.Defaulable;

import java.util.function.Supplier;

public interface DefaulableFactory {
    static Defaulable create(Supplier<Defaulable> supplier){
        return supplier.get();
    }
}
