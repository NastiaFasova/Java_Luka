package museum;

import museum.exceptions.NotEnoughExhibitsException;

import java.time.LocalDate;
import java.util.List;

public class MuseumExhibition extends EntertainmentPlace implements Educatable {
    private static final int MIN_NUMBER = 5;
    private List<Manager> manager;
    private List<Exhibit> exhibits;
    private TypeOfExhibition typeOfExhibition;

    public MuseumExhibition(String name, String address, LocalDate time,
                            List<Visitor> visitors, List<Manager> manager, List<Exhibit> exhibits,
                            TypeOfExhibition typeOfExhibition) {
        super(name, address, time, visitors);
        this.manager = manager;
        if (exhibits.size() < MIN_NUMBER) {
            throw new NotEnoughExhibitsException("Not enough exhibits for opening the museum exhibition !!!");
        }
        this.exhibits = exhibits;
        this.typeOfExhibition = typeOfExhibition;
    }

    public TypeOfExhibition getTypeOfExhibition() {
        return typeOfExhibition;
    }

    public void educate() {
        System.out.println("This museum exhibition educates people");
    }

    public static class Manager extends Human {
        public Manager(String name, String surname, int age) {
            super(name, surname, age);
        }
    }

    @Override
    public String toString() {
        return "MuseumExhibition{" +
                "manager=" + manager +
                ", exhibits=" + exhibits +
                ", typeOfExhibition=" + typeOfExhibition +
                "} " + super.toString();
    }


}
