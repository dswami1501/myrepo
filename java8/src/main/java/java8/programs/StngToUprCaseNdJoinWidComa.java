package java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StngToUprCaseNdJoinWidComa {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<String> ages = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        String bs = ages.stream().map(bac -> bac.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(bs);
    }
}
