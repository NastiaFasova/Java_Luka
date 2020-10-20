package museum.equals_hashcode_practice;

public class Main {
    public static void main(String[] args) {
        EqualsHashcode practice = new EqualsHashcode();
        System.out.println("NonOverriddenHashcode\nAre hashcodes equal? " + practice.nonOverriddenHashcode());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("OverriddenHashcode\nAre hashcodes equal? " + practice.overriddenHashcode());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("OverriddenEquals\n Are object equal? " + practice.overriddenEquals());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("NonOverriddenEquals\n Are object equal? " + practice.nonOverriddenEquals());
    }
}
