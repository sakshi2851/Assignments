package OOPS;
class Employee{
    int salary;
}
class Manager extends Employee {
    int incentive = 10700;
}
class Labour extends Employee {
    int overtime = 1200;
}
public class Inheritance {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary=34560;
        Manager manager = new Manager();
        manager.incentive = employee.salary + manager.incentive;
        Labour labour = new Labour();
        labour.overtime = employee.salary + labour.overtime;
        System.out.println(employee.salary);
        System.out.println(manager.incentive);
        System.out.println(labour.overtime);
    }
}
