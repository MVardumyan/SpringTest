package App;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by evarmic on 30-Aug-18.
 *
 * For method replacement (<replaced-method></replaced-method>)
 */
public class StartReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("Method replaced");
        return null;
    }
}
