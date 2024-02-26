package java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapNdFlatMapEmployeeComparator {
    public static void main(String[] args) {
        List<String> empCity = new ArrayList<>();
        empCity.add("Indore");
        empCity.add("Pune");
        empCity.add("Bangalore");
        Employee1 emp = new Employee1(1, "deepak", empCity);

        List<String> emp1City = new ArrayList<>();
        emp1City.add("Indore");
        emp1City.add("Bangalore");
        Employee1 emp1 = new Employee1(2, "deepak", emp1City);

        List<String> emp2City = new ArrayList<>();
        emp2City.add("Pune");
        emp2City.add("Chennai");
        emp2City.add("Bangalore");
        Employee1 emp2 = new Employee1(3, "daram", emp2City);

        List<String> emp3City = new ArrayList<>();
        emp3City.add("Pune");
        emp3City.add("Indore");
        emp3City.add("Bangalore");
        Employee1 emp3 = new Employee1(4, "pradeep", emp3City);

        List<Employee1> empL = Arrays.asList(emp, emp1, emp2, emp3);

        //Todo: Comparator Demo Start
        List<Employee1> descEmpId = empL.stream().sorted((o1, o2) -> (int) (o2.getId() - o1.getId())).collect(Collectors.toList());
        System.out.println("descEmpId: "+descEmpId);
        List<Employee1> top3Id = descEmpId.stream().limit(3).collect(Collectors.toList());
        System.out.println("top3Id: "+top3Id);
        List<Employee1> idLessThen3rdLargest = descEmpId.stream().skip(3).collect(Collectors.toList());
        System.out.println("idLessThen3rdLargest: "+idLessThen3rdLargest);
        //Todo: Comparator Demo End

        //Todo: Map And Flat Map Demo
        // Application of FlatMap: Example here, the cities are in "List of List" format it will look something like [["bhopal","Indore"]]
        // Problem with Normal Map is it cannot work upon 2D List, that's where FlatMap came into picture
        // For here we are going to convert the List of List into a single List
        // Below is Map example
        List<List<String>> listOfCitites = empL.stream().map(empObj -> empObj.getCity()).collect(Collectors.toList());
        System.out.println("listOfCitites: "+listOfCitites);

        //Below is FlatMap example
        /*Set<String> flaMapOfCities = empL.stream().flatMap(empOb -> empOb.getCity().stream()).collect(Collectors.toSet());
        System.out.println("flatMapOfCities: "+flaMapOfCities);*/
        Set<String> flaMapOfCities = empL.stream().flatMap(empOb -> empOb.getCity().stream()).collect(Collectors.toSet());
        System.out.println("flatMapOfCities: "+flaMapOfCities);

        //Map And Flat Map Demo
    }
}
