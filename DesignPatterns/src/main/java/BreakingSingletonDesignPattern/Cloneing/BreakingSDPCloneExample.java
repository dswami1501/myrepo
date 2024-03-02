package BreakingSingletonDesignPattern.Cloneing;

public class BreakingSDPCloneExample {
    public static void main(String[] args) throws Exception{
        BreakingSDPClone s1 = BreakingSDPClone.getSamosa();
        System.out.println(s1.hashCode());

        BreakingSDPClone clone = (BreakingSDPClone) s1.clone();
        System.out.println(clone.hashCode());
    }
}