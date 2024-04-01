package java8.concept;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeDB {
    public static List<Employee> getEmployee(int num){
        return IntStream.rangeClosed(1,num).mapToObj(i -> new Employee(i, "Employee"+i, 18+i)).collect(Collectors.toList());
    }
}
