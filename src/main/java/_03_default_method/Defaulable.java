package _03_default_method;

public interface Defaulable {
    default String notRequired(){
        return "Default implementation ";
    }
}
