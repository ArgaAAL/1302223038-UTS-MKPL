package lib;

public enum EmployeeGrade {
    GRADE_1(3_000_000),
    GRADE_2(5_000_000),
    GRADE_3(7_000_000);

    private final int salary;

    EmployeeGrade(int salary) {
        this.salary = salary;
    }

    public int getBaseSalary() {
        return salary;
    }
}
