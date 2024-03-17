package task5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {
    private Object obj;
    public Handler(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        double start = System.nanoTime();
        double res = (double) method.invoke(obj, args);
        double finish = System.nanoTime();
        System.out.println("Elapsed time: " + (finish-start) + " ns");
        System.out.println("res: " + res);
        return res;
    }
}
