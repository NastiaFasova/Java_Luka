package museum;

public class Exhibit {
    private String name;
    private int age;
    private String location;

    public Exhibit(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Exhibit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Exhibit(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Exhibit exhibit = (Exhibit) o;

        if (age != exhibit.age) {
            return false;
        }
        if (name != null ? !name.equals(exhibit.name) : exhibit.name != null) {
            return false;
        }
        return location != null ? location.equals(exhibit.location) : exhibit.location == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Exhibit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
