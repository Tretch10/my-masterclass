package newFeatures.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployees extends Employee {

    public StreamEmployees(int id, String name, double salary) {
        super(id, name, salary);
    }

    public static void main(String[] args) {
        List<Employee> sortedList = getEmployees().stream().filter((employee) -> employee.getSalary()>50000).collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("================");
        List<Employee> sortedList1 = getEmployees().stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
        sortedList1.forEach(System.out::println);
        System.out.println("================");
        List<Employee> sortedList2 = getEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        List<Employee> sortedList3 = getEmployees().stream().sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println("===============");



    }

    public static List<Employee> getEmployees () {
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee(1, "James", 60000));
            employeeList.add(new Employee(2, "Mary", 20000));
            employeeList.add(new Employee(3, "John", 65000));
            employeeList.add(new Employee(4, "Azar", 90000));
            employeeList.add(new Employee(5, "Zuby", 45000));
            return employeeList;

        }

}
