package staticEnum;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee one = new Employee("Yossi", 2, Employee.Departments.QA);
        Employee two = new Employee("Tal", 3, Employee.Departments.RnD);
        Employee three = new Employee("Moshe", 1, Employee.Departments.Finance);
        Employee four = new Employee("Yaakov", 5, Employee.Departments.Finance);
        Employee five = new Employee("Shon", 3, Employee.Departments.QA);

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());

        System.out.println(four.getMinimalYearsExperience());
        one.setMinimalYearsExperience(44);

        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());

        System.out.println(four.getMinimalYearsExperience());

    }
}