public class Course {

    //Variables
    private String name;
    private String courseNumber;
    private int cost;

    //Constructor
    public Course(String name, String courseNumber, int cost) {
        this.name = name;
        this.courseNumber = courseNumber;
        this.cost = cost;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    //toString

    @Override
    public String toString() {
        return "Course" +
                "name= " + name + courseNumber + "\n" +
                "Cost: $" + cost;
    }
}

