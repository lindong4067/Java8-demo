package _06_param_name;

import sun.plugin2.util.ParameterNames;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParamName {
    public static void main(String[] args) throws Exception {
        Method method = ParameterNames.class.getMethod( "main", String[].class );
        for( final Parameter parameter: method.getParameters() ) {
            System.out.println( "Parameter: " + parameter.getName() );
        }
    }
}
