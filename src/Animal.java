public abstract class Animal {

    private final String name;
    private final boolean isMammal;

    public Animal(boolean isMammal, String name) {
        this.isMammal = isMammal;
        this.name = name;
    }

    public abstract void makeSound();

    public boolean isMammal() {
        return isMammal;
    }

    public String getName() {
        return name;
    }
}
