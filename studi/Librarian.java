package studi;

class Librarian extends User {
    private String employeeID;

    public Librarian(String userID, String password, String name, String employeeID) {
        super(userID, password, name);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() { return employeeID; }

    @Override
    public String toString() {
        return super.toString() + " (ID Pegawai: " + employeeID + ")";
    }
}
