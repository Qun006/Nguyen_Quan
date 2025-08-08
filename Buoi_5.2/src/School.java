public class School {
    private String nameSchool;
    private String dateSchool;

    public School(String nameSchool, String dateSchool) {
        this.nameSchool = nameSchool;
        this.dateSchool = dateSchool;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getDateSchool() {
        return dateSchool;
    }

    public void setDateSchool(String dateSchool) {
        this.dateSchool = dateSchool;
    }

    @Override
    public String toString() {
        return "School: " + nameSchool + "\n Date of joining to School: " + dateSchool;
    }
}
