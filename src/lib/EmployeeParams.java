package lib;

public class EmployeeParams {
    public String employeeId;
    public String firstName;
    public String lastName;
    public String idNumber;
    public String address;
    public int yearJoined;
    public int monthJoined;
    public int dayJoined;
    public boolean isForeigner;
    public Gender gender;

    public EmployeeParams(String employeeId, String firstName, String lastName, String idNumber, String address,
                          int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, Gender gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.dayJoined = dayJoined;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }
}
