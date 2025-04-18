package lib;

public class Spouse {
    private String name;
    private String idNumber;

    public Spouse(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public boolean isEmpty() {
        return idNumber == null || idNumber.isEmpty();
    }
}
