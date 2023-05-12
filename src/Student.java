public class Student {

    //Variable
    private String fname;
    private String lname;
    private int year;
    private int studentID;
    private Account studentAcct;

    //Constructor


    public Student(String fname, String lname, int year, Account studentAcct) {
        this.fname = fname;
        this.lname = lname;
        this.year = year;
        this.studentID = studentIDGenerator(year);
        this.studentAcct = studentAcct;
    }

    //Setters and Getters
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student" + '\n' +
                "fname= " + fname + '\n' +
                "lname= " + lname + '\n' +
                "year= " + year + '\n' +
                "studentID= " + studentID;
    }

    public int studentIDGenerator(int year) {

        //Declare initial variables in ID generator method
        String yearString = Integer.toString(year);
        int defaultIDLength = 7;
        String baseline = "0123456789";
        char[] id = new char[defaultIDLength];

        for (int i = 0; i < defaultIDLength; i++) {
            int rand = (int) (Math.random() * baseline.length());
            id[i] = baseline.charAt(rand);
        }
        String studentIDString = yearString + new String(id);
       int studentID = Integer.parseInt(studentIDString);
       return studentID;
    }

}
