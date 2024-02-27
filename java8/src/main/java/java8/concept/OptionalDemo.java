package java8.concept;

import java.util.Optional;

public class OptionalDemo {
//Todo:Done
    public static void main(String[] args) {
//Optional.of(emp);//In case you are sure that the value is not null
//Optional.ofNullable(emp);*///In case you are not sure about value then use this
//optionalEmp.isPresent returns boolean value
//optionalEmp.isPresentOrElse()
//optionalEmp.get() will retrieve the object in case it is present otherwise it will throw error
//optionalEmp.orElse(new Employee(1, name, 31)); This will return the value if it is present otherwise orElse's value
//.get() and .orElseThrow() are same methods
//optionalEmp.orElseGet(Supplier Function)

        Optional<Employee> samEmp = getEmp("sam");
        if (samEmp.isPresent()){
            System.out.println(samEmp.get().getName());
        }else {
            System.out.println(0);
        }
    }
    public static Optional<Employee> getEmp(String name){
        Employee emp = new Employee(1, name, 31);
        return Optional.of(emp);//In case you are sure that the value is not null
        /*return Optional.ofNullable(emp);*///In case you are not sure about value then use this
    }
}
