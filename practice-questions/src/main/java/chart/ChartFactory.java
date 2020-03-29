package chart;

import java.lang.reflect.Method;

public class ChartFactory {


    public static Chart chartFactory(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(className);
        Method aa = aClass.getDeclaredMethod("aa", ChartFactory.class);
        aa.invoke()
        return (Chart)aClass.newInstance();
    }

}
