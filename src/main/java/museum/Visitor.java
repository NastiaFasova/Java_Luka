package museum;

import java.util.ArrayList;
import java.util.List;

//Асоциация между Visitor и Exhibition
public class Visitor extends Human {

    public Visitor(String name, String surname, int age) {
        super(name, surname, age);
    }

    public <T extends EntertainmentPlace> void visit(T place) {
        Visitor visitor = new Visitor(super.getName(), super.getSurname(),
                super.getAge());
        System.out.println(super.getName() + " " + super.getSurname()
                + " is visiting " + place.getName());
        List<Visitor> visitors = new ArrayList<>(place.getVisitors());
        visitors.add(visitor);
        place.setVisitors(visitors);
    }

    @Override
    public String greet() {
        return super.greet() + " I like visiting museums ";
    }
}
