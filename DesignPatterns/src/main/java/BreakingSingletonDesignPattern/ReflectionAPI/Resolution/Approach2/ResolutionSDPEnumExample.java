package BreakingSingletonDesignPattern.ReflectionAPI.Resolution.Approach2;

public class ResolutionSDPEnumExample {
    public static void main(String[] args) throws Exception{
        ResolutionSDPEnum s1 = ResolutionSDPEnum.INSTANCE;
        System.out.println(s1.hashCode());

        ResolutionSDPEnum s2 = ResolutionSDPEnum.INSTANCE;
        System.out.println(s2.hashCode());        
    }
}