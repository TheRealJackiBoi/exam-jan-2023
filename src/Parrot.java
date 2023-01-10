public class Parrot extends Animal{

    public Parrot(boolean isMammal, String name) {
        super(isMammal, name);
    }

    public void makeSound() {
        System.out.println("Hello, I'm a parrot");
    }

    @Override
    public String toString() {
        return "I'm a parrot, my name is " + getName() + ", and I'm " + (isMammal() ? " a mammal" : "not a mammal");
    }

}