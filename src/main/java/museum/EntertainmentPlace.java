package museum;

import museum.exceptions.NotEnoughVisitorsException;

import java.time.LocalDate;
import java.util.List;

public abstract class EntertainmentPlace {
    private static final int MIN_NUMBER = 5;
    private String name;
    private String address;
    private LocalDate time;
    private List<Visitor> visitors;

    public EntertainmentPlace(String name, String address, LocalDate time, List<Visitor> visitors)
            {
        this.name = name;
        this.address = address;
        this.time = time;
        if (visitors.size() < MIN_NUMBER) {
            try {
                throw new NotEnoughVisitorsException("Not enough visitors for opening the museum exhibition");
            } catch (NotEnoughVisitorsException e) {
                e.printStackTrace();
            }
        }
        this.visitors = visitors;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getTime() {
        return time;
    }

    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(List<Visitor> visitors) {
        this.visitors = visitors;
    }

    @Override
    public String toString() {
        return "EntertainmentPlace{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", time=" + time +
                ", visitors=" + visitors +
                '}';
    }
}
