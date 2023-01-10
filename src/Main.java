import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn  = new Scanner(System.in);

        System.out.println("Print first lions name: ");
        String firstLionsName;
        firstLionsName = scn.nextLine();


        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(
                new Lion(true, firstLionsName),
                new Parrot(false, "Oliver"),
                new Lion(true, "Jack"),
                new Lion(true, "Line"),
                new Parrot(false, "Petra")
        ));

        for (Animal a : animals) {
            a.makeSound();
            System.out.println(a);
        }

        ArrayList<Animal> mammals = findMammals(animals);
        ArrayList<Lion> lions = findLions(animals);
        ArrayList<Parrot> parrots = findParrots(animals);

        /*
        printArrayFormatted("Mammals", mammals);
        printArrayFormatted("Mammals", lions);
        printArrayFormatted("Mammals", parrots);
        */
    }

    public static ArrayList<Animal> findMammals(ArrayList<Animal> animals) {
        ArrayList<Animal> mammals = new ArrayList<>();

        for (Animal a :
                animals) {
            if (a.isMammal())
                mammals.add(a);
        }
        if (mammals.isEmpty())
            return null;
        return mammals;
    }

    public static ArrayList<Lion> findLions(ArrayList<Animal> animals) {
        ArrayList<Lion> lions = new ArrayList<>();

        for (Animal a :
                animals) {
            if (a instanceof Lion)
                lions.add((Lion)a);
        }
        if (lions.isEmpty())
            return null;
        return lions;
    }

    public static ArrayList<Parrot> findParrots(ArrayList<Animal> animals) {
        ArrayList<Parrot> parrots = new ArrayList<>();

        for (Animal a :
                animals) {
            if (a instanceof Parrot)
                parrots.add((Parrot) a);
        }
        if (parrots.isEmpty())
            return null;
        return parrots;
    }

    public static void printArrayFormatted(String title, ArrayList<Animal> animals) {
        System.out.println("---------------------");
        System.out.println(title +": ");
        for (Animal a :
                animals) {
            System.out.println(a);
        }
    }
}