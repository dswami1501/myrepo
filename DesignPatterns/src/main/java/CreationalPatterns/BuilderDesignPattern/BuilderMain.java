package CreationalPatterns.BuilderDesignPattern;

public class BuilderMain {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder().setId("1").build();
        System.out.println(user1);
        User user2 = new User.UserBuilder().setId("2").setName("Deepak").build();
        System.out.println(user2);
        User user3 = User.UserBuilder.builder().setId("3").setName("Swami").build();
        System.out.println(user3);
    }
}
