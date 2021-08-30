package Spring.mvc.assignment10;



public class Employee {
    String empId,empName,empSalary;

    public Employee(String id, String name, String salary) {
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id='" + empId + '\'' +
                ", Name='" + empName + '\'' +
                ", Salary='" + empSalary + '\'' +
                '}';
    }
}