public class Employee {
    private String staff;
    private int salaryStaff;
    private int departmentNumber;
    private int id;
    private static int counter = 0;

    public Employee(String staff, int salaryStaff, int departmentNumber) {
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        this.id = getCounter();
        counter++;
    }

    public static int getCounter() {return counter;}

    public String getStaff() {
        return staff;
    }

    public int getId() {
        return id;
    }

    public int getSalaryStaff() {
        return salaryStaff;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + staff + " Зарплата сотрудника: " + salaryStaff + " Номер департамента: " + departmentNumber + " Идентификационный номер: " + id;
    }

}
