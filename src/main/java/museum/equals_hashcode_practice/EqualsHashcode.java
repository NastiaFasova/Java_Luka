package museum.equals_hashcode_practice;

import museum.Exhibit;
import museum.Visitor;

public class EqualsHashcode {

    /*Вызываем непереопределенный метод hashcode()
      Функция должна возвращать false*/
    public boolean nonOverriddenHashcode() {
        Visitor firstVisitor = new Visitor("Olha", "Dmytriv", 14);
        Visitor secondVisitor = new Visitor("Olha", "Dmytriv", 14);
        int firstHashcode = firstVisitor.hashCode();
        int secondHashcode = secondVisitor.hashCode();
        System.out.println(firstVisitor);
        System.out.println(secondVisitor);
        return firstHashcode == secondHashcode;
    }

    /*Вызываем переопределенный метод hashcode()
         Функция должна возвращать true*/
    public boolean overriddenHashcode() {
        Exhibit firstExhibit = new Exhibit("weapon");
        Exhibit secondExhibit = new Exhibit("weapon");
        int firstHashcode = firstExhibit.hashCode();
        int secondHashcode = secondExhibit.hashCode();
        System.out.println(firstExhibit);
        System.out.println(secondExhibit);
        return firstHashcode == secondHashcode;
    }

    /*Вызываем переопределенный метод equals()
        Функция должна возвращать true*/
    public boolean overriddenEquals() {
        Exhibit firstExhibit = new Exhibit("weapon");
        Exhibit secondExhibit = new Exhibit("weapon");
        System.out.println(firstExhibit);
        System.out.println(secondExhibit);
        return firstExhibit.equals(secondExhibit);
    }

    /*Вызываем непереопределенный метод equals()
        Функция должна возвращать false*/
    public boolean nonOverriddenEquals() {
        Visitor firstVisitor = new Visitor("Olha", "Dmytriv", 14);
        Visitor secondVisitor = new Visitor("Olha", "Dmytriv", 14);
        System.out.println(firstVisitor);
        System.out.println(secondVisitor);
        return firstVisitor.equals(secondVisitor);
    }
}
