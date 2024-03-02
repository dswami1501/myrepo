package BehaviouralPattern.IteratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        UserManagement um = new UserManagement();
        um.addUser(new User("1","Deepak"));
        um.addUser(new User("2","Swami"));
        um.addUser(new User("3","Raj"));
        um.addUser(new User("4","Deepak"));
        um.addUser(new User("5","Raku"));

        MyIterator iterator = um.getIterator();
        while (iterator.hasNext()){
            User next = (User) iterator.next();
            System.out.println(next.getName());
        }
    }
}
