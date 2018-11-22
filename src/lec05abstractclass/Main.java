package lec05abstractclass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeMonthly emp1 = new EmployeeMonthly("Kevin", 1, 18000);
        EmployeeDaily emp2 = new EmployeeDaily("George", 2);
        emp2.setNumDays(15);
        EmployeeMonthly emp3 = new EmployeeMonthly("Matt", 3, 22000);
        EmployeeDaily emp4 = new EmployeeDaily("Katie", 4);
        emp4.setNumDays(25);

        // we cannot instantiate an abstract classs
        // this line of code will have syntax/compile error
        // EmployeeDaily emp5 = new Employee("Anne", 5);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println(getTotalPay(employees));
    }

    public static double getTotalPay(ArrayList<Employee> employees) {
        double total = 0;
        for (Employee e : employees) {
            total += e.getPayment();
        }
        return total;
    }
}
