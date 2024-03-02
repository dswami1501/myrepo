package CreationalPatterns.BuilderDesignPattern;

public class User {
    private String id;
    private String name;

    private User(UserBuilder userBuilder) {
        this.id=userBuilder.id;
        this.name=userBuilder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    static class UserBuilder{
        private String id;
        private String name;

        public UserBuilder() {
        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
