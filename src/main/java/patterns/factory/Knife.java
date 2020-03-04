package patterns.factory;

public abstract class Knife {
    public Knife() {
        System.out.println("Creating Knife object");
    }

    public abstract void describe();

    public enum KnifeType {
        NONE,
        CHEF,
        HOUSEHOLD,
        BUTCHER
    }
}
