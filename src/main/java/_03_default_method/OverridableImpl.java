package _03_default_method;

public class OverridableImpl implements Defaulable {
    @Override
    public String notRequired() {
        return "Overridden Implementation ";
    }
}
