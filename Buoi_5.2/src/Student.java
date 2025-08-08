public class Student {
    private String nameStudent;
    private String classStudent;
    private double score;
    private Faculty y;

    public Student(Faculty y, double score, String classStudent, String nameStudent) {
        this.y = y;
        this.score = score;
        this.classStudent = classStudent;
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return y + "\n Student: " + nameStudent + "\n Class: " + classStudent + "\n Score: " + score;
    }
}
