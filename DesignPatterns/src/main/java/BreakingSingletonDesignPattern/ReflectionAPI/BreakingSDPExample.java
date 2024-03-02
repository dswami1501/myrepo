package BreakingSingletonDesignPattern.ReflectionAPI;

import java.lang.reflect.Constructor;

public class BreakingSDPExample {
    public static void main(String[] args) throws Exception{
        BreakingSDP s1 = BreakingSDP.getBreakingSDP();
        System.out.println(s1.hashCode());

        Constructor<BreakingSDP> c = BreakingSDP.class.getDeclaredConstructor();
        c.setAccessible(true);
        BreakingSDP s2 = c.newInstance();
        System.out.println(s2.hashCode());
    }
}