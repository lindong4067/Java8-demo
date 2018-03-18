package _01_lambda;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );

        Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );

        Arrays.asList( "a", "b", "d" ).forEach( e -> {
            System.out.print( e );
            System.out.print( e );
        } );

        //Lambda可以引用类的成员变量与局部变量（如果这些变量不是final的话，它们会被隐含的转为final，这样效率更高）
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );
        //等价于
        final String separator11 = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator11 ) );

        //Lambda可能会返回一个值。返回值的类型也是由编译器推测出来的。如果lambda的函数体只有一行的话，
        // 那么没有必要显式使用return语句。
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
        //等价于
        Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
            int result = e1.compareTo( e2 );
            return result;
        } );

    }
}
