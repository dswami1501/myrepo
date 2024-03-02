package BreakingSingletonDesignPattern.Cloneing.Resolution;

public class ResolutionSDPCloneExample {
    public static void main(String[] args) throws Exception{
        ResolutionSDPClone s1 = ResolutionSDPClone.getSamosa();
        System.out.println(s1.hashCode());

        ResolutionSDPClone clone = (ResolutionSDPClone) s1.clone();
        System.out.println(clone.hashCode());
    }
}