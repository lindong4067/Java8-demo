package _04_static_method;

import _03_default_method.Defaulable;
import _03_default_method.DefaultableImpl;
import _03_default_method.OverridableImpl;

public class Test {
    public static void main(String[] args) {
        Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
        System.out.println(defaulable.notRequired());

        defaulable = DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());
    }
}
