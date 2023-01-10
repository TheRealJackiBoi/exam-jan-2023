public class Lion extends Animal{


    public Lion(boolean isMammal, String name) {
        super(isMammal, name);
    }

    public void makeSound() {
        System.out.println("Roooaaar");
    }

    @Override
    public String toString() {
        return "I'm a lion, my name is " + getName() + ", and I'm " + (isMammal() ? " a mammal" : "not a mammal");
    }
}
