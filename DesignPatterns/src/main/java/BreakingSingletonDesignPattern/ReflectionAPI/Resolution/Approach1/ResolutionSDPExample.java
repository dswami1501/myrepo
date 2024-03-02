package BreakingSingletonDesignPattern.ReflectionAPI.Resolution.Approach1;

import java.lang.reflect.Constructor;

public class ResolutionSDPExample {
    public static void main(String[] args) throws Exception{
        ResolutionSDP s1 = ResolutionSDP.getSamosa();
        System.out.println(s1.hashCode());

        Constructor<ResolutionSDP> c = ResolutionSDP.class.getDeclaredConstructor();
        c.setAccessible(true);
        ResolutionSDP s2 = c.newInstance();
        System.out.println(s2.hashCode());
    }
}