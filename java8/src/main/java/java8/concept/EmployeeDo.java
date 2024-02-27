package java8.concept;

public class EmployeeDo {
    private int id;
    private String name;
    private int age;

    public EmployeeDo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public EmployeeDo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName(){
        System.out.println("In Emp Class: "+name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
