public class Main {
    public static void employeeMinSalary(Employee[] employees) {
        if (employees[0] != null) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryStaff() > employee.getSalaryStaff())
                    emp = employee;
            }

            System.out.println("Сотрудник с минимальной зарплатой: " + emp.getSalaryStaff() + " " + emp.getStaff() + " " + emp.getId());
        } else {
            throw new NullPointerException("Проверьте массив");
        }
    }

    public static void employeeMaxSalary(Employee[] employees) {
        if (employees[0] != null) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryStaff() < employee.getSalaryStaff()) {
                    emp = employee;
                }

            }

            System.out.println("Сотрудник с максимальной зарплатой: " + emp.getSalaryStaff() + " " + emp.getStaff() + " " + emp.getId());
        } else {
            throw new NullPointerException("Проверьте массив");
        }
    }

    public static void allStaff(Employee[] employees) {
        if (employees[0] != null) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        } else {
            throw new NullPointerException("Проверьте массив");
        }
    }

    public static int countStaffSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        return sum;
    }

    public static void averageSalary(Employee[] employees) {
        int sum = countStaffSalary(employees);
        float average = (float)sum / employees.length;
        System.out.println("Средняя зарплата: " + average);
    }

    public static void allStaffFIO(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Сотрудники компании: " + employee.getStaff());
        }
    }


    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Ivanovich", 50000, 1);
        employee[1] = new Employee("Ivanov Ivan Ivanovich2", 60000, 2);
        employee[2] = new Employee("Ivanov Ivan Ivanovich3", 70000, 2);
        employee[3] = new Employee("Ivanov Ivan Ivanovich4", 50000, 1);
        employee[4] = new Employee("Ivanov Ivan Ivanovich5", 90000, 2);
        employee[5] = new Employee("Ivanov Ivan Ivanovich6", 30000, 2);
        employee[6] = new Employee("Ivanov Ivan Ivanovich7", 20000, 3);
        employee[7] = new Employee("Ivanov Ivan Ivanovich8", 50000, 3);
        employee[8] = new Employee("Ivanov Ivan Ivanovich9", 50000, 3);
        employee[9] = new Employee("Ivanov Ivan Ivanovich10", 50000, 2);

        allStaff(employee);
        employeeMinSalary(employee);
        employeeMaxSalary(employee);
        countStaffSalary(employee);
        averageSalary(employee);
        allStaffFIO(employee);
    }
}