package studi;

class Student extends User {
    private String studentID;

    public Student(String userID, String password, String name, String studentID) {
        super(userID, password, name);
        this.studentID = studentID;
    }

    public String getStudentID() { return studentID; }

    @Override
    public String toString() {
        return super.toString() + " (ID Mahasiswa: " + studentID + ")";
    }
}
