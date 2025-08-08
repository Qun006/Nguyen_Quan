public class Faculty {
    private String nameFaculty;
    private String dateFaculty;
    private School x;

    public Faculty(String nameFaculty, School x, String dateFaculty) {
        this.nameFaculty = nameFaculty;
        this.x = x;
        this.dateFaculty = dateFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getDateFaculty() {
        return dateFaculty;
    }

    public void setDateFaculty(String dateFaculty) {
        this.dateFaculty = dateFaculty;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return x + "\n Faculty: " + nameFaculty + "\n Date of joining to Faculty: " + dateFaculty;
    }
}
