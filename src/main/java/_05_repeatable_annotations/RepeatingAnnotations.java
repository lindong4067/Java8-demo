package _05_repeatable_annotations;

import java.lang.annotation.*;

public class RepeatingAnnotations {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Filter("filter1")
    @Filter("filter2")
    public interface Filterable {
    }

    public static void main(String[] args) {
        Filter[] annotations = Filterable.class.getAnnotationsByType(Filter.class);
        for (Filter annotation : annotations) {
            System.out.println(annotation.value());
        }
    }
}
